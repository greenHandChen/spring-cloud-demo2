package com.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

// 启动配置中心
@EnableConfigServer
@SpringBootApplication
// 将配置中心注册到服务注册中心:当有多个配置中心被注册到服务注册中心，基于以下亮点即可完成配置中心的高可用
// 1.服务注册中心会维护每个服务的不同实例
// 2.通过服务发现，消费方去调用服务时，会先从服务注册中心获取服务清单，通过定义好的负载均衡策略选取一个服务实例进行调用
@EnableDiscoveryClient
public class ConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGitApplication.class, args);
	}
}
