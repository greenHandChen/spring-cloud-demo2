package com.ceh.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by enHui.Chen on 2018/3/12 0012.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudSleuth1Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudSleuth1Application.class, args);
    }
}
