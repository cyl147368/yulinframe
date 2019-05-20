package com.orderService2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderService2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderService2Application.class).web(true).run(args);
    }

}
