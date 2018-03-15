package com.ceh.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by enHui.Chen on 2018/3/12 0012.
 */
@RestController
public class SleuthTrace2Controller {
    private Logger logger = LoggerFactory.getLogger(SleuthTrace2Controller.class);

    @RequestMapping(value = "/sleuth2")
    public String sleuth2(HttpServletRequest request) {
        logger.info("X-B3-TraceId:" + request.getHeader("X-B3-TraceId") + ";X-B3-SpanId:" + request.getHeader("X-B3-SpanId")
                + ";X-Span-Name:" + request.getHeader("X-Span-Name"));
        return "ok";
    }
}
