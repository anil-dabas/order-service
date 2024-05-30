package com.kwenta.test.repository;

import com.kwenta.test.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,String> {
}
