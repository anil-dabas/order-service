package com.kwenta.test.service;

import com.kwenta.test.model.ConditionalOrder;
import com.kwenta.test.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders(String account, String marketKey);

    List<ConditionalOrder> getConditionalOrders(String account, String marketKey);
}
