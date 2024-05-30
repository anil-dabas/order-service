package com.kwenta.test.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kwenta.test.model.Order;
import com.kwenta.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static com.kwenta.test.constant.Constants.QUERY;
import static com.kwenta.test.constant.Constants.SUBGRAPH_URL;

@Service
public class SubgraphFetchServiceImpl {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final OrderRepository orderRepository;

    @Autowired
    public SubgraphFetchServiceImpl(OrderRepository orderRepository) {
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
        this.orderRepository = orderRepository;
    }
    public void fetchOrdersFromSubgraph() throws JsonProcessingException {

        String response = restTemplate.postForObject(SUBGRAPH_URL, QUERY, String.class);

        JsonNode root = objectMapper.readTree(response);
        JsonNode ordersNode = root.path("data").path("smartMarginOrders");
        List<Order> orders = Arrays.asList(objectMapper.treeToValue(ordersNode, Order[].class));
        orderRepository.saveAll(orders);
    }
}
