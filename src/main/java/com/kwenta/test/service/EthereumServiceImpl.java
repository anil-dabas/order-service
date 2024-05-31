package com.kwenta.test.service;

import com.kwenta.test.generatedfiles.Events;
import com.kwenta.test.model.ConditionalOrder;
import com.kwenta.test.repository.ConditionalOrderRepository;
import io.reactivex.Flowable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.methods.response.*;
import org.web3j.tx.gas.DefaultGasProvider;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import static com.kwenta.test.constant.Constants.*;
import static com.kwenta.test.generatedfiles.Events.*;

@Service
public class EthereumServiceImpl {

    @Autowired
    private ConditionalOrderRepository conditionalOrderRepository;
    private final Web3j web3j;
    private final Events eventsContract;


    public EthereumServiceImpl(Web3j web3j) {
        this.web3j = web3j;
        this.eventsContract = Events.load(CONTRACT_ADDRESS, web3j, Credentials.create(ACCESS_KEY), new DefaultGasProvider());
    }

    public void readOrdersFromChain() throws IOException {
        BigInteger latestBlock = web3j.ethBlockNumber().send().getBlockNumber();
        BigInteger sb = BigInteger.valueOf(INITIAL_START_BLOCK);
        List<BaseEventResponse> collectedEvents = new CopyOnWriteArrayList<>();
        while(sb.compareTo(latestBlock)<0) {
            // Updating the latest Block in the chain during the process
            latestBlock = web3j.ethBlockNumber().send().getBlockNumber();

            // Calculating the block for the next iteration

            BigInteger nb = sb.add(STEP).min(latestBlock);
            DefaultBlockParameter startBlock = DefaultBlockParameter.valueOf(sb);
            DefaultBlockParameter nextBlock = DefaultBlockParameter.valueOf(nb);


            // Getting the Order Placed events, Order Cancelled events, and Order Filled events

            Flowable<Events.ConditionalOrderPlacedEventResponse> orderPlacedEventFlowable = eventsContract.conditionalOrderPlacedEventFlowable(startBlock, nextBlock);
            Flowable<Events.ConditionalOrderCancelledEventResponse> orderCancelledEventResponseFlowable = eventsContract.conditionalOrderCancelledEventFlowable(startBlock, nextBlock);
            Flowable<Events.ConditionalOrderFilledEventResponse> orderFilledEventResponseFlowable = eventsContract.conditionalOrderFilledEventFlowable(startBlock, nextBlock);

            // Extracting orders from orders events
            extractOrderDetailsFromOrderPlacedEvent(orderPlacedEventFlowable, collectedEvents);
            extractOrderDetailsFromOrderCancelledEvent(orderCancelledEventResponseFlowable, collectedEvents);
            extractOrderDetailsFromOrderFilledEvent(orderFilledEventResponseFlowable, collectedEvents);


            sb = nb.add(BigInteger.ONE);
            if(sb.compareTo(latestBlock)> 0){
                break;
            }

        }

    }

    @Scheduled(fixedRate = 6000)  // Run every 60 seconds
    public void processPendingOrders() {
        List<ConditionalOrder> pendingOrders = conditionalOrderRepository.findAllByReadyForExecutionFalse();
        for (ConditionalOrder order : pendingOrders) {
            if (isOrderReadyForExecution(order)) {
                order.setReadyForExecution(true);
                conditionalOrderRepository.save(order);
            }
        }
    }

    private boolean isOrderReadyForExecution(ConditionalOrder order) {
        try {
            BigInteger gasUsed = eventsContract.emitConditionalOrderPlaced(order.getOrderId(), order.getGelatoTaskId(),order.getMarketKey().getBytes(StandardCharsets.UTF_8),order.getMarginDelta(),order.getSizeDelta(),order.getTargetPrice(),order.getConditionalOrderType(),order.getDesiredFillPrice(),order.getReduceOnly()).send().getCumulativeGasUsed();
            return gasUsed.compareTo(DefaultGasProvider.GAS_LIMIT) < 0;
        } catch (Exception e) {
            return false;
        }
    }

    private void extractOrderDetailsFromOrderPlacedEvent(Flowable<ConditionalOrderPlacedEventResponse> orderPlacedEventFlowable, List<BaseEventResponse> collectedEvents) {
        orderPlacedEventFlowable.subscribe(log -> {
            ConditionalOrderPlacedEventResponse resp = getConditionalOrderPlacedEventFromLog(log.log);
            if(resp.conditionalOrderType.intValue() == 0){
                ConditionalOrder order = ConditionalOrder.builder().orderId(resp.conditionalOrderId).account(resp.account).conditionalOrderType(resp.conditionalOrderType)
                        .desiredFillPrice(resp.desiredFillPrice).desiredFillPrice(resp.desiredFillPrice).marketKey(new String (resp.marketKey, StandardCharsets.UTF_8).replace("\u0000", ""))
                        .reduceOnly(resp.reduceOnly).marginDelta(resp.marginDelta).sizeDelta(resp.sizeDelta).readyForExecution(false).build();
                conditionalOrderRepository.save(order);
            }
        }, error -> System.out.println(error.getMessage()));
    }

    private void extractOrderDetailsFromOrderCancelledEvent(Flowable<ConditionalOrderCancelledEventResponse> orderCancelledEventResponseFlowable, List<BaseEventResponse> collectedEvents) {
        orderCancelledEventResponseFlowable.subscribe(log -> {
            ConditionalOrderCancelledEventResponse resp = getConditionalOrderCancelledEventFromLog(log.log);
            Optional<ConditionalOrder> optionalOrder = conditionalOrderRepository.findById(resp.conditionalOrderId);
            if(optionalOrder.isPresent()){
                ConditionalOrder order = optionalOrder.get();
                order.setCancelReason(resp.reason);
                conditionalOrderRepository.save(order);
            }
        }, error -> System.out.println(error.getMessage()));
    }

    private void extractOrderDetailsFromOrderFilledEvent(Flowable<ConditionalOrderFilledEventResponse> orderFilledEventResponseFlowable, List<BaseEventResponse> collectedEvents) {
        orderFilledEventResponseFlowable.subscribe(log -> {
            ConditionalOrderFilledEventResponse resp = getConditionalOrderFilledEventFromLog(log.log);
            Optional<ConditionalOrder> optionalOrder = conditionalOrderRepository.findById(resp.conditionalOrderId);
            if(optionalOrder.isPresent()){
                ConditionalOrder order = optionalOrder.get();
                order.setFillPrice(resp.fillPrice);
                order.setKeeperFee(resp.keeperFee);
                order.setPriceOracle(resp.priceOracle);
                conditionalOrderRepository.save(order);
            }
        }, error -> System.out.println(error.getMessage()));
    }
}
