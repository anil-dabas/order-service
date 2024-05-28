package com.kwenta.test.constant;

public class Constants {
    public static final String SUBGRAPH_URL = "https://api.thegraph.com/subgraphs/name/kwenta/optimism-perps";
    public static final String QUERY = "{ \"query\": \"{ smartMarginOrders(where: {orderType: Limit}) { id account orderType marketKey recordTrade feesPaid } }\" }";

}
