package com.kwenta.test.generatedfiles;

import io.reactivex.Flowable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.*;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.5.3.
 */
@SuppressWarnings("rawtypes")
public class Events extends Contract {
    public static final String BINARY = "60a0604052348015600e575f80fd5b50604051610e72380380610e72833981016040819052602b91603b565b6001600160a01b03166080526066565b5f60208284031215604a575f80fd5b81516001600160a01b0381168114605f575f80fd5b9392505050565b608051610dae6100c45f395f818161015c015281816101c2015281816102bf015281816103a70152818161048e01528181610591015281816106820152818161076201528181610849015281816109290152610a100152610dae5ff3fe608060405234801561000f575f80fd5b50600436106100a6575f3560e01c806379a495271161006e57806379a495271461010b578063a91ee3051461011e578063b014da2114610131578063b019b4e814610144578063c45a015514610157578063d63f1ca61461019a575f80fd5b8063146c64fc146100aa57806328ba84ca146100bf5780633b57226b146100d25780633b9d50e7146100e5578063568824dc146100f8575b5f80fd5b6100bd6100b8366004610b02565b6101ad565b005b6100bd6100cd366004610b94565b6102aa565b6100bd6100e0366004610bbc565b610392565b6100bd6100f3366004610bed565b610479565b6100bd610106366004610c3e565b61057c565b6100bd610119366004610b94565b61066d565b6100bd61012c366004610bbc565b61074d565b6100bd61013f366004610b94565b610834565b6100bd610152366004610bbc565b610914565b61017e7f000000000000000000000000000000000000000000000000000000000000000081565b6040516001600160a01b03909116815260200160405180910390f35b6100bd6101a8366004610c87565b6109fb565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa15801561020f573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906102339190610cbd565b61025057604051630e58d18160e21b815260040160405180910390fd5b8789336001600160a01b03167fba811735fedb82e0b67094c3a35da6b732eddc026ac4c96ffe39530d5ad706f58a8a8a8a8a8a8a6040516102979796959493929190610cfb565b60405180910390a4505050505050505050565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa15801561030c573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906103309190610cbd565b61034d57604051630e58d18160e21b815260040160405180910390fd5b60405181815233906001600160a01b038416907f5548c837ab068cf56a2c2479df0882a4922fd203edb7517321831d95078c5f62906020015b60405180910390a35050565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa1580156103f4573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906104189190610cbd565b61043557604051630e58d18160e21b815260040160405180910390fd5b806001600160a01b0316826001600160a01b03167f52d2da59f56f31503d90a3f1f08001c5705116f9e44f9ee08a7ebe1354b2cf4860405160405180910390a35050565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa1580156104db573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906104ff9190610cbd565b61051c57604051630e58d18160e21b815260040160405180910390fd5b604080516001600160a01b0387811682528681166020830152851681830152606081018490526080810183905290517ff91fb43a848c5a47fa97f843dad71ad1264fae4f40ca09f5b63804f53285fe2d9181900360a00190a15050505050565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa1580156105de573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106029190610cbd565b61061f57604051630e58d18160e21b815260040160405180910390fd5b8385336001600160a01b03167f23644a348af99f6c71d7ec999ded77ff899c87403fdc65eafed1bd0f336b21dd86868660405161065e93929190610d40565b60405180910390a45050505050565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa1580156106cf573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106f39190610cbd565b61071057604051630e58d18160e21b815260040160405180910390fd5b60405181815233906001600160a01b038416907f4ffc5e5909c5e9b0ea91efeaddb04bf70a58475f0c5f62d0314e6636ddb9ae9690602001610386565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa1580156107af573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906107d39190610cbd565b6107f057604051630e58d18160e21b815260040160405180910390fd5b806001600160a01b0316826001600160a01b03167faab1e52e5e9244a59f6d721ebad6da39111d47dba7c5b9cd735a06f839e8eb0260405160405180910390a35050565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa158015610896573d5f803e3d5ffd5b505050506040513d601f19601f820116820180604052508101906108ba9190610cbd565b6108d757604051630e58d18160e21b815260040160405180910390fd5b60405181815233906001600160a01b038416907f9b1bfa7fa9ee420a16e124f794c35ac9f90472acc99140eb2f6447c714cad8eb90602001610386565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa158015610976573d5f803e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061099a9190610cbd565b6109b757604051630e58d18160e21b815260040160405180910390fd5b806001600160a01b0316826001600160a01b03167f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e060405160405180910390a35050565b604051632f2e037160e11b81523360048201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635e5c06e290602401602060405180830381865afa158015610a5d573d5f803e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610a819190610cbd565b610a9e57604051630e58d18160e21b815260040160405180910390fd5b8183336001600160a01b03167fc5a43b936a8a2cbc928f034c4caa61dfa41b4cf0ec2782f472f9d16433199dc684604051610ad99190610d65565b60405180910390a4505050565b60028110610af2575f80fd5b50565b8015158114610af2575f80fd5b5f805f805f805f805f6101208a8c031215610b1b575f80fd5b8935985060208a0135975060408a0135965060608a0135955060808a0135945060a08a0135935060c08a0135610b5081610ae6565b925060e08a013591506101008a0135610b6881610af5565b809150509295985092959850929598565b80356001600160a01b0381168114610b8f575f80fd5b919050565b5f8060408385031215610ba5575f80fd5b610bae83610b79565b946020939093013593505050565b5f8060408385031215610bcd575f80fd5b610bd683610b79565b9150610be460208401610b79565b90509250929050565b5f805f805f60a08688031215610c01575f80fd5b610c0a86610b79565b9450610c1860208701610b79565b9350610c2660408701610b79565b94979396509394606081013594506080013592915050565b5f805f805f60a08688031215610c52575f80fd5b853594506020860135935060408601359250606086013591506080860135610c7981610ae6565b809150509295509295909350565b5f805f60608486031215610c99575f80fd5b83359250602084013591506040840135610cb281610ae6565b809150509250925092565b5f60208284031215610ccd575f80fd5b8151610cd881610af5565b9392505050565b60028110610af257634e487b7160e01b5f52602160045260245ffd5b5f60e082019050888252876020830152866040830152856060830152610d2085610cdf565b8460808301528360a083015282151560c083015298975050505050505050565b8381526020810183905260608101610d5783610cdf565b826040830152949350505050565b60208101610d7283610cdf565b9190529056fea264697066735822122091109acb5c3cbea8e9e9b9d0f1f1520ad7188be43b8897d84924baf709ca034964736f6c63430008190033";

    private static String librariesLinkedBinary;

    public static final String FUNC_EMITCONDITIONALORDERCANCELLED = "emitConditionalOrderCancelled";

    public static final String FUNC_EMITCONDITIONALORDERFILLED = "emitConditionalOrderFilled";

    public static final String FUNC_EMITCONDITIONALORDERPLACED = "emitConditionalOrderPlaced";

    public static final String FUNC_EMITDELEGATEDACCOUNTADDED = "emitDelegatedAccountAdded";

    public static final String FUNC_EMITDELEGATEDACCOUNTREMOVED = "emitDelegatedAccountRemoved";

    public static final String FUNC_EMITDEPOSIT = "emitDeposit";

    public static final String FUNC_EMITETHWITHDRAW = "emitEthWithdraw";

    public static final String FUNC_EMITOWNERSHIPTRANSFERRED = "emitOwnershipTransferred";

    public static final String FUNC_EMITUNISWAPV3SWAP = "emitUniswapV3Swap";

    public static final String FUNC_EMITWITHDRAW = "emitWithdraw";

    public static final String FUNC_FACTORY = "factory";

    public static final Event CONDITIONALORDERCANCELLED_EVENT = new Event("ConditionalOrderCancelled", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Bytes32>(true) {}, new TypeReference<Uint8>() {}));
    ;

    public static final Event CONDITIONALORDERFILLED_EVENT = new Event("ConditionalOrderFilled", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Bytes32>(true) {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
    ;

    public static final Event CONDITIONALORDERPLACED_EVENT = new Event("ConditionalOrderPlaced", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Bytes32>(true) {}, new TypeReference<Bytes32>() {}, new TypeReference<Int256>() {}, new TypeReference<Int256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event DELEGATEDACCOUNTADDED_EVENT = new Event("DelegatedAccountAdded", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event DELEGATEDACCOUNTREMOVED_EVENT = new Event("DelegatedAccountRemoved", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event DEPOSIT_EVENT = new Event("Deposit", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event ETHWITHDRAW_EVENT = new Event("EthWithdraw", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event OWNERSHIPTRANSFERRED_EVENT = new Event("OwnershipTransferred", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event UNISWAPV3SWAP_EVENT = new Event("UniswapV3Swap", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event WITHDRAW_EVENT = new Event("Withdraw", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    @Deprecated
    protected Events(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Events(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Events(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Events(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<ConditionalOrderCancelledEventResponse> getConditionalOrderCancelledEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(CONDITIONALORDERCANCELLED_EVENT, transactionReceipt);
        ArrayList<ConditionalOrderCancelledEventResponse> responses = new ArrayList<ConditionalOrderCancelledEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ConditionalOrderCancelledEventResponse typedResponse = new ConditionalOrderCancelledEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.account = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.conditionalOrderId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.gelatoTaskId = (byte[]) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.reason = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static ConditionalOrderCancelledEventResponse getConditionalOrderCancelledEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(CONDITIONALORDERCANCELLED_EVENT, log);
        ConditionalOrderCancelledEventResponse typedResponse = new ConditionalOrderCancelledEventResponse();
        typedResponse.log = log;
        typedResponse.account = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.conditionalOrderId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.gelatoTaskId = (byte[]) eventValues.getIndexedValues().get(2).getValue();
        typedResponse.reason = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<ConditionalOrderCancelledEventResponse> conditionalOrderCancelledEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getConditionalOrderCancelledEventFromLog(log));
    }

    public Flowable<ConditionalOrderCancelledEventResponse> conditionalOrderCancelledEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CONDITIONALORDERCANCELLED_EVENT));
        return conditionalOrderCancelledEventFlowable(filter);
    }

    public static List<ConditionalOrderFilledEventResponse> getConditionalOrderFilledEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(CONDITIONALORDERFILLED_EVENT, transactionReceipt);
        ArrayList<ConditionalOrderFilledEventResponse> responses = new ArrayList<ConditionalOrderFilledEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ConditionalOrderFilledEventResponse typedResponse = new ConditionalOrderFilledEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.account = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.conditionalOrderId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.gelatoTaskId = (byte[]) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.fillPrice = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.keeperFee = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.priceOracle = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static ConditionalOrderFilledEventResponse getConditionalOrderFilledEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(CONDITIONALORDERFILLED_EVENT, log);
        ConditionalOrderFilledEventResponse typedResponse = new ConditionalOrderFilledEventResponse();
        typedResponse.log = log;
        typedResponse.account = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.conditionalOrderId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.gelatoTaskId = (byte[]) eventValues.getIndexedValues().get(2).getValue();
        typedResponse.fillPrice = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
        typedResponse.keeperFee = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
        typedResponse.priceOracle = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
        return typedResponse;
    }

    public Flowable<ConditionalOrderFilledEventResponse> conditionalOrderFilledEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getConditionalOrderFilledEventFromLog(log));
    }

    public Flowable<ConditionalOrderFilledEventResponse> conditionalOrderFilledEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CONDITIONALORDERFILLED_EVENT));
        return conditionalOrderFilledEventFlowable(filter);
    }

    public static List<ConditionalOrderPlacedEventResponse> getConditionalOrderPlacedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(CONDITIONALORDERPLACED_EVENT, transactionReceipt);
        ArrayList<ConditionalOrderPlacedEventResponse> responses = new ArrayList<ConditionalOrderPlacedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ConditionalOrderPlacedEventResponse typedResponse = new ConditionalOrderPlacedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.account = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.conditionalOrderId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.gelatoTaskId = (byte[]) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.marketKey = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.marginDelta = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.sizeDelta = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.targetPrice = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            typedResponse.conditionalOrderType = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
            typedResponse.desiredFillPrice = (BigInteger) eventValues.getNonIndexedValues().get(5).getValue();
            typedResponse.reduceOnly = (Boolean) eventValues.getNonIndexedValues().get(6).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static ConditionalOrderPlacedEventResponse getConditionalOrderPlacedEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(CONDITIONALORDERPLACED_EVENT, log);
        ConditionalOrderPlacedEventResponse typedResponse = new ConditionalOrderPlacedEventResponse();
        typedResponse.log = log;
        typedResponse.account = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.conditionalOrderId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.gelatoTaskId = (byte[]) eventValues.getIndexedValues().get(2).getValue();
        typedResponse.marketKey = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
        typedResponse.marginDelta = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
        typedResponse.sizeDelta = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
        typedResponse.targetPrice = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
        typedResponse.conditionalOrderType = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
        typedResponse.desiredFillPrice = (BigInteger) eventValues.getNonIndexedValues().get(5).getValue();
        typedResponse.reduceOnly = (Boolean) eventValues.getNonIndexedValues().get(6).getValue();
        return typedResponse;
    }


    public Flowable<ConditionalOrderPlacedEventResponse> conditionalOrderPlacedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getConditionalOrderPlacedEventFromLog(log));
    }

    public Flowable<ConditionalOrderPlacedEventResponse> conditionalOrderPlacedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CONDITIONALORDERPLACED_EVENT));
        return conditionalOrderPlacedEventFlowable(filter);
    }

    public static List<DelegatedAccountAddedEventResponse> getDelegatedAccountAddedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DELEGATEDACCOUNTADDED_EVENT, transactionReceipt);
        ArrayList<DelegatedAccountAddedEventResponse> responses = new ArrayList<DelegatedAccountAddedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            DelegatedAccountAddedEventResponse typedResponse = new DelegatedAccountAddedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.caller = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.delegate = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static DelegatedAccountAddedEventResponse getDelegatedAccountAddedEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(DELEGATEDACCOUNTADDED_EVENT, log);
        DelegatedAccountAddedEventResponse typedResponse = new DelegatedAccountAddedEventResponse();
        typedResponse.log = log;
        typedResponse.caller = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.delegate = (String) eventValues.getIndexedValues().get(1).getValue();
        return typedResponse;
    }

    public Flowable<DelegatedAccountAddedEventResponse> delegatedAccountAddedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getDelegatedAccountAddedEventFromLog(log));
    }

    public Flowable<DelegatedAccountAddedEventResponse> delegatedAccountAddedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DELEGATEDACCOUNTADDED_EVENT));
        return delegatedAccountAddedEventFlowable(filter);
    }

    public static List<DelegatedAccountRemovedEventResponse> getDelegatedAccountRemovedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DELEGATEDACCOUNTREMOVED_EVENT, transactionReceipt);
        ArrayList<DelegatedAccountRemovedEventResponse> responses = new ArrayList<DelegatedAccountRemovedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            DelegatedAccountRemovedEventResponse typedResponse = new DelegatedAccountRemovedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.caller = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.delegate = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static DelegatedAccountRemovedEventResponse getDelegatedAccountRemovedEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(DELEGATEDACCOUNTREMOVED_EVENT, log);
        DelegatedAccountRemovedEventResponse typedResponse = new DelegatedAccountRemovedEventResponse();
        typedResponse.log = log;
        typedResponse.caller = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.delegate = (String) eventValues.getIndexedValues().get(1).getValue();
        return typedResponse;
    }

    public Flowable<DelegatedAccountRemovedEventResponse> delegatedAccountRemovedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getDelegatedAccountRemovedEventFromLog(log));
    }

    public Flowable<DelegatedAccountRemovedEventResponse> delegatedAccountRemovedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DELEGATEDACCOUNTREMOVED_EVENT));
        return delegatedAccountRemovedEventFlowable(filter);
    }

    public static List<DepositEventResponse> getDepositEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DEPOSIT_EVENT, transactionReceipt);
        ArrayList<DepositEventResponse> responses = new ArrayList<DepositEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            DepositEventResponse typedResponse = new DepositEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static DepositEventResponse getDepositEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(DEPOSIT_EVENT, log);
        DepositEventResponse typedResponse = new DepositEventResponse();
        typedResponse.log = log;
        typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<DepositEventResponse> depositEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getDepositEventFromLog(log));
    }

    public Flowable<DepositEventResponse> depositEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DEPOSIT_EVENT));
        return depositEventFlowable(filter);
    }

    public static List<EthWithdrawEventResponse> getEthWithdrawEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ETHWITHDRAW_EVENT, transactionReceipt);
        ArrayList<EthWithdrawEventResponse> responses = new ArrayList<EthWithdrawEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            EthWithdrawEventResponse typedResponse = new EthWithdrawEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static EthWithdrawEventResponse getEthWithdrawEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(ETHWITHDRAW_EVENT, log);
        EthWithdrawEventResponse typedResponse = new EthWithdrawEventResponse();
        typedResponse.log = log;
        typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<EthWithdrawEventResponse> ethWithdrawEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getEthWithdrawEventFromLog(log));
    }

    public Flowable<EthWithdrawEventResponse> ethWithdrawEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ETHWITHDRAW_EVENT));
        return ethWithdrawEventFlowable(filter);
    }

    public static List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, transactionReceipt);
        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.caller = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static OwnershipTransferredEventResponse getOwnershipTransferredEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, log);
        OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
        typedResponse.log = log;
        typedResponse.caller = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
        return typedResponse;
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getOwnershipTransferredEventFromLog(log));
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERRED_EVENT));
        return ownershipTransferredEventFlowable(filter);
    }

    public static List<UniswapV3SwapEventResponse> getUniswapV3SwapEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(UNISWAPV3SWAP_EVENT, transactionReceipt);
        ArrayList<UniswapV3SwapEventResponse> responses = new ArrayList<UniswapV3SwapEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            UniswapV3SwapEventResponse typedResponse = new UniswapV3SwapEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.tokenIn = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.tokenOut = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.recipient = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.amountIn = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            typedResponse.amountOutMinimum = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static UniswapV3SwapEventResponse getUniswapV3SwapEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(UNISWAPV3SWAP_EVENT, log);
        UniswapV3SwapEventResponse typedResponse = new UniswapV3SwapEventResponse();
        typedResponse.log = log;
        typedResponse.tokenIn = (String) eventValues.getNonIndexedValues().get(0).getValue();
        typedResponse.tokenOut = (String) eventValues.getNonIndexedValues().get(1).getValue();
        typedResponse.recipient = (String) eventValues.getNonIndexedValues().get(2).getValue();
        typedResponse.amountIn = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
        typedResponse.amountOutMinimum = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
        return typedResponse;
    }

    public Flowable<UniswapV3SwapEventResponse> uniswapV3SwapEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getUniswapV3SwapEventFromLog(log));
    }

    public Flowable<UniswapV3SwapEventResponse> uniswapV3SwapEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(UNISWAPV3SWAP_EVENT));
        return uniswapV3SwapEventFlowable(filter);
    }

    public static List<WithdrawEventResponse> getWithdrawEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(WITHDRAW_EVENT, transactionReceipt);
        ArrayList<WithdrawEventResponse> responses = new ArrayList<WithdrawEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            WithdrawEventResponse typedResponse = new WithdrawEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static WithdrawEventResponse getWithdrawEventFromLog(Log log) {
        EventValuesWithLog eventValues = staticExtractEventParametersWithLog(WITHDRAW_EVENT, log);
        WithdrawEventResponse typedResponse = new WithdrawEventResponse();
        typedResponse.log = log;
        typedResponse.user = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<WithdrawEventResponse> withdrawEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getWithdrawEventFromLog(log));
    }

    public Flowable<WithdrawEventResponse> withdrawEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(WITHDRAW_EVENT));
        return withdrawEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> emitConditionalOrderCancelled(BigInteger conditionalOrderId, byte[] gelatoTaskId, BigInteger reason) {
        final Function function = new Function(
                FUNC_EMITCONDITIONALORDERCANCELLED, 
                Arrays.<Type>asList(new Uint256(conditionalOrderId),
                new Bytes32(gelatoTaskId),
                new Uint8(reason)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitConditionalOrderFilled(BigInteger conditionalOrderId, byte[] gelatoTaskId, BigInteger fillPrice, BigInteger keeperFee, BigInteger priceOracle) {
        final Function function = new Function(
                FUNC_EMITCONDITIONALORDERFILLED, 
                Arrays.<Type>asList(new Uint256(conditionalOrderId),
                new Bytes32(gelatoTaskId),
                new Uint256(fillPrice),
                new Uint256(keeperFee),
                new Uint8(priceOracle)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitConditionalOrderPlaced(BigInteger conditionalOrderId, byte[] gelatoTaskId, byte[] marketKey, BigInteger marginDelta, BigInteger sizeDelta, BigInteger targetPrice, BigInteger conditionalOrderType, BigInteger desiredFillPrice, Boolean reduceOnly) {
        final Function function = new Function(
                FUNC_EMITCONDITIONALORDERPLACED, 
                Arrays.<Type>asList(new Uint256(conditionalOrderId),
                new Bytes32(gelatoTaskId),
                new Bytes32(marketKey),
                new Int256(marginDelta),
                new Int256(sizeDelta),
                new Uint256(targetPrice),
                new Uint8(conditionalOrderType),
                new Uint256(desiredFillPrice),
                new Bool(reduceOnly)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitDelegatedAccountAdded(String caller, String delegate) {
        final Function function = new Function(
                FUNC_EMITDELEGATEDACCOUNTADDED, 
                Arrays.<Type>asList(new Address(160, caller),
                new Address(160, delegate)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitDelegatedAccountRemoved(String caller, String delegate) {
        final Function function = new Function(
                FUNC_EMITDELEGATEDACCOUNTREMOVED, 
                Arrays.<Type>asList(new Address(160, caller),
                new Address(160, delegate)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitDeposit(String user, BigInteger amount) {
        final Function function = new Function(
                FUNC_EMITDEPOSIT, 
                Arrays.<Type>asList(new Address(160, user),
                new Uint256(amount)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitEthWithdraw(String user, BigInteger amount) {
        final Function function = new Function(
                FUNC_EMITETHWITHDRAW, 
                Arrays.<Type>asList(new Address(160, user),
                new Uint256(amount)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitOwnershipTransferred(String caller, String newOwner) {
        final Function function = new Function(
                FUNC_EMITOWNERSHIPTRANSFERRED, 
                Arrays.<Type>asList(new Address(160, caller),
                new Address(160, newOwner)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitUniswapV3Swap(String tokenIn, String tokenOut, String recipient, BigInteger amountIn, BigInteger amountOutMinimum) {
        final Function function = new Function(
                FUNC_EMITUNISWAPV3SWAP, 
                Arrays.<Type>asList(new Address(160, tokenIn),
                new Address(160, tokenOut),
                new Address(160, recipient),
                new Uint256(amountIn),
                new Uint256(amountOutMinimum)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> emitWithdraw(String user, BigInteger amount) {
        final Function function = new Function(
                FUNC_EMITWITHDRAW, 
                Arrays.<Type>asList(new Address(160, user),
                new Uint256(amount)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> factory() {
        final Function function = new Function(FUNC_FACTORY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static Events load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Events(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Events load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Events(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Events load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Events(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Events load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Events(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Events> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _factory) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _factory)));
        return deployRemoteCall(Events.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<Events> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _factory) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _factory)));
        return deployRemoteCall(Events.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Events> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _factory) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _factory)));
        return deployRemoteCall(Events.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Events> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _factory) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Address(160, _factory)));
        return deployRemoteCall(Events.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    public static void linkLibraries(List<LinkReference> references) {
        librariesLinkedBinary = linkBinaryWithReferences(BINARY, references);
    }

    public static String getDeploymentBinary() {
        if (librariesLinkedBinary != null) {
            return librariesLinkedBinary;
        } else {
            return BINARY;
        }
    }

    public static class ConditionalOrderCancelledEventResponse extends BaseEventResponse {
        public String account;

        public BigInteger conditionalOrderId;

        public byte[] gelatoTaskId;

        public BigInteger reason;
    }

    public static class ConditionalOrderFilledEventResponse extends BaseEventResponse {
        public String account;

        public BigInteger conditionalOrderId;

        public byte[] gelatoTaskId;

        public BigInteger fillPrice;

        public BigInteger keeperFee;

        public BigInteger priceOracle;
    }

    public static class ConditionalOrderPlacedEventResponse extends BaseEventResponse {
        public String account;

        public BigInteger conditionalOrderId;

        public byte[] gelatoTaskId;

        public byte[] marketKey;

        public BigInteger marginDelta;

        public BigInteger sizeDelta;

        public BigInteger targetPrice;

        public BigInteger conditionalOrderType;

        public BigInteger desiredFillPrice;

        public Boolean reduceOnly;
    }

    public static class DelegatedAccountAddedEventResponse extends BaseEventResponse {
        public String caller;

        public String delegate;
    }

    public static class DelegatedAccountRemovedEventResponse extends BaseEventResponse {
        public String caller;

        public String delegate;
    }

    public static class DepositEventResponse extends BaseEventResponse {
        public String user;

        public String account;

        public BigInteger amount;
    }

    public static class EthWithdrawEventResponse extends BaseEventResponse {
        public String user;

        public String account;

        public BigInteger amount;
    }

    public static class OwnershipTransferredEventResponse extends BaseEventResponse {
        public String caller;

        public String newOwner;
    }

    public static class UniswapV3SwapEventResponse extends BaseEventResponse {
        public String tokenIn;

        public String tokenOut;

        public String recipient;

        public BigInteger amountIn;

        public BigInteger amountOutMinimum;
    }

    public static class WithdrawEventResponse extends BaseEventResponse {
        public String user;

        public String account;

        public BigInteger amount;
    }
}
