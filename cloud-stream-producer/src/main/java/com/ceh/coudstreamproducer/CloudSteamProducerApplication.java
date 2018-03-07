package com.ceh.coudstreamproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class CloudSteamProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSteamProducerApplication.class, args);
	}
}
