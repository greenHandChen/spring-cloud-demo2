package com.ceh.zipkin.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

// 使用rabbitmq消息中间件异步收集跟踪信息
@EnableZipkinStreamServer
@SpringBootApplication
@EnableDiscoveryClient
public class CloudZipkinServerByRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZipkinServerByRabbitmqApplication.class, args);
	}
}
