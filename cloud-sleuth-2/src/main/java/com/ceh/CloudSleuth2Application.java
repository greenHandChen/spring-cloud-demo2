package com.ceh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by enHui.Chen on 2018/3/12 0012.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudSleuth2Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudSleuth2Application.class, args);
    }
}
