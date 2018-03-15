package com.ceh.sleuth.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by enHui.Chen on 2018/3/12 0012.
 */
@FeignClient("cloud-sleuth-2")
@ResponseBody
public interface SleuthTraceService1 {

    @RequestMapping(value = "/sleuth2", method = RequestMethod.POST)
    String sleuth1();
}
