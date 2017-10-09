package com.eurekaFeign.controller;

import com.eurekaFeign.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2017/10/9 0009.
 */
@RestController
public class FeignController {
    // 注入一个负载均衡的feign客户端
    @Autowired
    ConsumerFeign consumerFeign;

    @RequestMapping("/testFeign")
    public String testFeign(){
        return  consumerFeign.consumer();
    }
}
