package com.coffeetoubatech.coffeetoubatechgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoffeeToubaTechGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeeToubaTechGatewayApplication.class, args);
    }

    @Bean
    DiscoveryClientRouteDefinitionLocator discoveryClientRouteDefinitionLocator(ReactiveDiscoveryClient
                                                                    rct, DiscoveryLocatorProperties dcvlp){

        return  new DiscoveryClientRouteDefinitionLocator(rct,dcvlp);
    }
}
