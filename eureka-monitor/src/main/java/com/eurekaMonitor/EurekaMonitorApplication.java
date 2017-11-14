package com.eurekaMonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class EurekaMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMonitorApplication.class, args);
	}
}
