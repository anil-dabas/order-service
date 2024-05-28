package com.kwenta.test.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kwenta.test.model.Order;
import com.kwenta.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.tx.Contract;

import java.math.BigDecimal;
import java.util.Arrays;

import static com.kwenta.test.constant.Constants.QUERY;
import static com.kwenta.test.constant.Constants.SUBGRAPH_URL;

@Service
public class SubgraphFetchServiceImpl {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final OrderRepository orderRepository;

    @Autowired
    public SubgraphFetchServiceImpl(OrderRepository orderRepository) {
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
        this.orderRepository = orderRepository;
    }
    public void fetchOrdersFromSubgraph() throws JsonProcessingException {

        String response = restTemplate.postForObject(SUBGRAPH_URL, QUERY, String.class);

        JsonNode root = objectMapper.readTree(response);
        JsonNode orders = root.path("data").path("smartMarginOrders");
        // TODO need to convert the values to Proper string and integer values instead of storing Hexadecimals in database
        for (JsonNode orderNode : orders) {
            Order order = new Order();
            order.setId(orderNode.path("id").asText());
            order.setAccount(orderNode.path("account").asText());
            order.setOrderType(orderNode.path("orderType").asText());
            order.setMarketKey(orderNode.path("marketKey").asText());
            order.setRecordTrade(orderNode.path("recordTrade").asText());
            order.setFeesPaid(new BigDecimal(orderNode.path("feesPaid").asText()));
            orderRepository.save(order);
        }
    }
}
