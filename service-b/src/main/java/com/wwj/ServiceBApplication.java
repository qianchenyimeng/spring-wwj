package com.wwj;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceBApplication {
    public static void main(String[] args) {

        new SpringApplicationBuilder(ServiceBApplication.class).web(true).run(args);
    }
}