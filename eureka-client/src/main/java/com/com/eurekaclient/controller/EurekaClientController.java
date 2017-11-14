package com.com.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2017/9/30 0030.
 */
@RestController
public class EurekaClientController {
    @RequestMapping(value = "/test")
    public String test(String name) {
        return "hello " + name;
    }
}
