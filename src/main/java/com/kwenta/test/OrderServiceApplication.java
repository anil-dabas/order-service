package com.kwenta.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kwenta.test.service.SubgraphFetchServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) throws JsonProcessingException {
		ConfigurableApplicationContext context = SpringApplication.run(OrderServiceApplication.class, args);
		SubgraphFetchServiceImpl subgraphFetchService = context.getBean(SubgraphFetchServiceImpl.class);
		subgraphFetchService.fetchOrdersFromSubgraph();
	}

}
