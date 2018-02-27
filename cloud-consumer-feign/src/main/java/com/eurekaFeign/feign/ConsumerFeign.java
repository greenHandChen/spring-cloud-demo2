package com.eurekaFeign.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by enHui.Chen on 2017/10/9 0009.
 */
@FeignClient(value = "eureka-client")
public interface ConsumerFeign {
    /**
     * @Author: enHui.Chen
     * @Description: 如果想要传递参数通过@RequestParam注解来传递参数
     * @Data 2017/10/10 0010
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    String consumer(@RequestParam(value = "name") String name);
}
