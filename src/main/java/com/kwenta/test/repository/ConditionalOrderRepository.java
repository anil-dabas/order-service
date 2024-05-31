package com.kwenta.test.repository;

import com.kwenta.test.model.ConditionalOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface ConditionalOrderRepository extends JpaRepository<ConditionalOrder, BigInteger> {
    List<ConditionalOrder> findAllByReadyForExecutionFalse();
}
