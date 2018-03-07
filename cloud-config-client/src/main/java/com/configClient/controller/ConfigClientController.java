package com.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2017/10/9 0009.
 */
// 配置信息的动态刷新
@RefreshScope
@RestController
public class ConfigClientController {
    @Value("${test}")
    private String test;

    @RequestMapping("/testClient")
    public String test(@RequestParam(name = "request") String request) {
        return test + request;
    }
}
