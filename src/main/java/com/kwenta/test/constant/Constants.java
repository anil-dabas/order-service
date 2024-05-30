package com.kwenta.test.constant;

import java.math.BigInteger;

public class Constants {
    public static final String SUBGRAPH_URL = "https://api.thegraph.com/subgraphs/name/kwenta/optimism-perps";
    public static final String CONNECTION_URL = "https://opt-mainnet.g.alchemy.com/v2/bSArc9MOcsd_RD_fP40OIGv02-OZFrFk";
    public static final String QUERY = "{ \"query\": \"{ smartMarginOrders(where: {orderType: Limit}) { id account orderType marketKey recordTrade feesPaid } }\" }";
    public static final String CONTRACT_ADDRESS = "0xc3d16e00833355b48d2fD69D838c6ACF004cf4b6";
    public static final String ACCESS_KEY = "d207ae34f16b4a608af1c1031bf25d85";
    public static final long INITIAL_START_BLOCK = 120000000;
    public static final BigInteger STEP = BigInteger.valueOf(2000);

}
