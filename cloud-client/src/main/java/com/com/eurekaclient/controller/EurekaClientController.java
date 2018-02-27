package com.com.eurekaclient.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by enHui.Chen on 2017/9/30 0030.
 */
@RestController
public class EurekaClientController {


    @RequestMapping(value = "/test")
    public String test(HttpServletRequest request, String name) {
        return request.getServerPort() + ":" + name;

    }
}
