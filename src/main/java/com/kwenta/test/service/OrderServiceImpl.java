package com.kwenta.test.service;

import com.kwenta.test.model.Order;
import com.kwenta.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }
    @Override
    public List<Order> getOrders(String account, String marketKey) {
        if (account != null && marketKey != null) {
            return orderRepository.findByAccountAndMarketKey(account, marketKey);
        } else if (account != null) {
            return orderRepository.findByAccount(account);
        } else if (marketKey != null) {
            return orderRepository.findByMarketKey(marketKey);
        } else {
            return orderRepository.findAll();
        }
    }
}
