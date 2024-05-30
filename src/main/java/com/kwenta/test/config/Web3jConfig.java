package com.kwenta.test.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import static com.kwenta.test.constant.Constants.CONNECTION_URL;

@Configuration
public class Web3jConfig {

    @Bean
    public Web3j web3j(){
        return Web3j.build(new HttpService(CONNECTION_URL));
    }
}
