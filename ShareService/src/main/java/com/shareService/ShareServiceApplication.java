package com.shareService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShareServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ShareServiceApplication.class).web(true).run(args);
    }

}
