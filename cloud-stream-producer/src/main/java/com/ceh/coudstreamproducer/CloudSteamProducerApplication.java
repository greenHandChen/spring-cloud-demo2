package com.ceh.coudstreamproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudSteamProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSteamProducerApplication.class, args);
	}
}
