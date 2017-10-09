package com.eurekaConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
// 开启服务发现注解，将当前服务加入到服务治理体系中
@EnableDiscoveryClient
public class EurekaConsumerApplication {
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
}
