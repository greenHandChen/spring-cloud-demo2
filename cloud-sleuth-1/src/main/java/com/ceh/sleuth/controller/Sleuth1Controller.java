package com.ceh.sleuth.controller;

import com.ceh.sleuth.service.SleuthTraceService1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2018/3/12 0012.
 */
@RestController
public class Sleuth1Controller {
    private Logger logger = LoggerFactory.getLogger(Sleuth1Controller.class);

    @Autowired
    private SleuthTraceService1 sleuthTraceService1;


    @RequestMapping("/sleuth1")
    public String sleuth1() {
        logger.info("It's Trace1!");
        return sleuthTraceService1.sleuth1();
    }
}
