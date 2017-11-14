package com.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2017/10/9 0009.
 */
@RestController
public class ConfigClientController {
    @Value("${test}")
    String test;
    @RequestMapping("/testClient")
    public String test(){
        return test;
    }
}
