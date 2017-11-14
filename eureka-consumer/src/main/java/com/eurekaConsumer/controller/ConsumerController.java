package com.eurekaConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by enHui.Chen on 2017/9/30 0030.
 */
@RestController
public class ConsumerController {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String consumer(String name) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        return restTemplate.getForObject("http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/test?name=" + name, String.class);
    }
}
