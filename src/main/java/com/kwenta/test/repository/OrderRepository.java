package com.kwenta.test.repository;

import com.kwenta.test.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,String> {
    List<Order> findByAccount(String account);
    List<Order> findByMarketKey(String marketKey);
    List<Order> findByAccountAndMarketKey(String account, String marketKey);
}
