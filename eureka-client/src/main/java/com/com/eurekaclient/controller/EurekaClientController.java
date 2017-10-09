package com.com.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by enHui.Chen on 2017/9/30 0030.
 */
@RestController
public class EurekaClientController {
    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        return "hello test: " + request.getServerPort();
    }
}
