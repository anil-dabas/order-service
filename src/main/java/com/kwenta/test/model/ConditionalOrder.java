package com.kwenta.test.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "conditionalOrder")
@Table(name = "conditional_order")
public class ConditionalOrder {

    @Id
    private BigInteger orderId;
    public String account;
    public byte[] gelatoTaskId;
    public byte[] marketKey;
    public BigInteger marginDelta;
    public BigInteger sizeDelta;
    public BigInteger targetPrice;
    public BigInteger conditionalOrderType;
    public BigInteger desiredFillPrice;
    public Boolean reduceOnly;
    private boolean readyForExecution;
    public BigInteger fillPrice;
    public BigInteger keeperFee;
    public BigInteger priceOracle;
    public BigInteger cancelReason;
}
