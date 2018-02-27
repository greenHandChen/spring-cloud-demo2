package com.eurekaconsumerribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by enHui.Chen on 2017/10/9 0009.
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "ribbonError")
    public String consumerRibbon(String name) {
        return restTemplate.getForObject("http://eureka-client/test?name=" + name, String.class);
    }
    // 断路方法返回值类型，参数列表个数与类型必须与主逻辑方法一致
    public String ribbonError(String name) {
        return "consumerRibbon is error...";
    }
}
