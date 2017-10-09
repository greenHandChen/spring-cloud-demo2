package com.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by enHui.Chen on 2017/9/30 0030.
 */
@RestController
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/consumerRibbon")
    public String consumerRibbon(){
        return restTemplate.getForObject("http://eureka-client/test",String.class);
    }
}
