package com.kwenta.test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private String account;
    private String orderType;
    private String marketKey;
    private String recordTrade;
    private BigDecimal feesPaid;
}
