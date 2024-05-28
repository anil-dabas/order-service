package com.kwenta.test.controller;

import com.kwenta.test.model.Order;
import com.kwenta.test.model.OrderDTO;
import com.kwenta.test.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final ModelMapper modelMapper;
    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
        modelMapper = new ModelMapper();
    }

    @GetMapping
    public ResponseEntity<List<OrderDTO>> getOrders(@RequestParam(required = false) String account,
                                                    @RequestParam(required = false) String marketKey){
        List<Order> orders = orderService.getOrders(account,marketKey);
        List<OrderDTO> orderDTOS = orders.stream().map(order -> modelMapper.map(order,OrderDTO.class)).toList();
        return ResponseEntity.ok(orderDTOS);
    }
}
