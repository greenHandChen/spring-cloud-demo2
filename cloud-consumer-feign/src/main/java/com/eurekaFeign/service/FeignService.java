package com.eurekaFeign.service;

import com.eurekaFeign.feign.ConsumerFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by enHui.Chen on 2017/10/9 0009.
 */
@Service
public class FeignService {
    // 注入一个负载均衡的feign客户端
    @Autowired
    ConsumerFeign consumerFeign;

    // 指明断路方法
    @HystrixCommand(fallbackMethod = "feignError")
    public String testFeign(String name) {
        return consumerFeign.consumer(name);
    }

    public String feignError(String name) {
        return "feign is error...";
    }
}
