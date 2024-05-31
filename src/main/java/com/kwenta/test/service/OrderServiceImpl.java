package com.kwenta.test.service;

import com.kwenta.test.model.ConditionalOrder;
import com.kwenta.test.model.Order;
import com.kwenta.test.repository.ConditionalOrderRepository;
import com.kwenta.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ConditionalOrderRepository conditionalOrderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, ConditionalOrderRepository conditionalOrderRepository) {
        this.orderRepository = orderRepository;
        this.conditionalOrderRepository = conditionalOrderRepository;
    }


    @Override
    public List<Order> getOrders(String account, String marketKey) {
        Order probe = Order.builder().marketKey(marketKey).account(account).build();
        ExampleMatcher matcher = ExampleMatcher.matchingAll().withIgnoreNullValues();
        Example<Order> example = Example.of(probe, matcher);
        return orderRepository.findAll(example);
    }

    @Override
    public List<ConditionalOrder> getConditionalOrders(String account, String marketKey) {
        ConditionalOrder probe = ConditionalOrder.builder().marketKey(marketKey).account(account).build();
        ExampleMatcher matcher = ExampleMatcher.matchingAll().withIgnoreNullValues();
        Example<ConditionalOrder> example = Example.of(probe, matcher);
        return conditionalOrderRepository.findAll(example);
    }
}
