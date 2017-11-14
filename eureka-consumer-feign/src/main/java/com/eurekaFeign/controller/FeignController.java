package com.eurekaFeign.controller;

import com.eurekaFeign.feign.ConsumerFeign;
import com.eurekaFeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by enHui.Chen on 2017/10/9 0009.
 */
@RestController
public class FeignController {
    @Autowired
    FeignService feignService;

    @RequestMapping("/testFeign")
    public String testFeign(String name) {
        return feignService.testFeign(name);
    }
}
