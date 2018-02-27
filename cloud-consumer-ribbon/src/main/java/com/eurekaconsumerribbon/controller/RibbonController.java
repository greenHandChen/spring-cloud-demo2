package com.eurekaconsumerribbon.controller;

import com.eurekaconsumerribbon.service.RibbonService;
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
    RibbonService ribbonService;
    @RequestMapping("/consumerRibbon")
    public String consumerRibbon(String name){
        return ribbonService.consumerRibbon(name);
    }
}
