package com.kwenta.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kwenta.test.service.EthereumServiceImpl;
import com.kwenta.test.service.SubgraphFetchServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

@SpringBootApplication
@EnableScheduling
public class OrderServiceApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(OrderServiceApplication.class, args);
		SubgraphFetchServiceImpl subgraphFetchService = context.getBean(SubgraphFetchServiceImpl.class);
		subgraphFetchService.fetchOrdersFromSubgraph();
		EthereumServiceImpl ethereumService = context.getBean(EthereumServiceImpl.class);
		CompletableFuture.runAsync(() -> {
            try {
                ethereumService.readOrdersFromChain();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
		 CompletableFuture.runAsync(ethereumService::processPendingOrders);
	}

}
