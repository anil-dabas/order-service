package com.kwenta.test.service;

import com.kwenta.test.model.ConditionalOrder;
import com.kwenta.test.model.Order;
import com.kwenta.test.repository.ConditionalOrderRepository;
import com.kwenta.test.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Example;

import java.util.ArrayList;
import java.util.List;

import static com.kwenta.test.constants.TestConstant.ACCOUNT;
import static com.kwenta.test.constants.TestConstant.MARKET_KEY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class OrderServiceImplTest {

    @Mock
    private OrderRepository orderRepository;

    @Mock
    private ConditionalOrderRepository conditionalOrderRepository;

    @InjectMocks
    private OrderServiceImpl orderService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetOrders() {
        // Mock data

        List<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(new Order());
        expectedOrders.add(new Order());

        // Mock behavior
        when(orderRepository.findAll(any(Example.class))).thenReturn(expectedOrders);

        // Call the method under test
        List<Order> actualOrders = orderService.getOrders(ACCOUNT, MARKET_KEY);

        // Verify behavior
        verify(orderRepository).findAll(any(Example.class));

        // Verify result
        assertEquals(expectedOrders, actualOrders);
    }

    @Test
    void testGetConditionalOrders() {
        // Mock data
        List<ConditionalOrder> expectedConditionalOrders = new ArrayList<>();
        expectedConditionalOrders.add(new ConditionalOrder());
        expectedConditionalOrders.add(new ConditionalOrder());

        // Mock behavior
        when(conditionalOrderRepository.findAll(any(Example.class))).thenReturn(expectedConditionalOrders);

        // Call the method under test
        List<ConditionalOrder> actualConditionalOrders = orderService.getConditionalOrders(ACCOUNT,MARKET_KEY);

        // Verify behavior
        verify(conditionalOrderRepository).findAll(any(Example.class));

        // Verify result
        assertEquals(expectedConditionalOrders, actualConditionalOrders);
    }
}
