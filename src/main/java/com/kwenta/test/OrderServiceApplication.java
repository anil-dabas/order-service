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

	public static void main(String[] args) throws IOException, InterruptedException {
		ConfigurableApplicationContext context = SpringApplication.run(OrderServiceApplication.class, args);
		SubgraphFetchServiceImpl subgraphFetchService = context.getBean(SubgraphFetchServiceImpl.class);
		subgraphFetchService.fetchOrdersFromSubgraph();
		EthereumServiceImpl ethereumService = context.getBean(EthereumServiceImpl.class);
	/*	ethereumService.readOrdersFromChain();
		ethereumService.processPendingOrders();*/
		CompletableFuture<Void> readOrdersFuture = CompletableFuture.runAsync(() -> {
            try {
                ethereumService.readOrdersFromChain();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

		// Run processPendingOrders asynchronously
		CompletableFuture<Void> processOrdersFuture = CompletableFuture.runAsync(ethereumService::processPendingOrders);
	}

}
