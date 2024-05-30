package com.kwenta.test.service;

import com.kwenta.test.model.ConditionalOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ConditionalOrderRepository extends JpaRepository<ConditionalOrder, BigInteger> {
}
