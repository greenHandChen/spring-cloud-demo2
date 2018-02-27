package com.eurekaApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// 开启路由网关
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApiGatewayApplication.class, args);
	}
}
