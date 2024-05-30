package com.kwenta.test.service;

import com.kwenta.test.model.Order;
import com.kwenta.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public List<Order> getOrders(String account, String marketKey) {
        Order probe = Order.builder().marketKey(marketKey).account(account).build();
        ExampleMatcher matcher = ExampleMatcher.matchingAll().withIgnoreNullValues();
        Example<Order> example = Example.of(probe, matcher);
        return orderRepository.findAll(example);
    }
}
