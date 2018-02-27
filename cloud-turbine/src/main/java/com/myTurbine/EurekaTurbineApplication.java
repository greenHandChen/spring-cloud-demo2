package com.myTurbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableDiscoveryClient
@EnableTurbine
@EnableAutoConfiguration
@SpringBootApplication
public class EurekaTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTurbineApplication.class, args);
    }
}
