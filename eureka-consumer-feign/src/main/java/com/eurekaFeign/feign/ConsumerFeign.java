package com.eurekaFeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by enHui.Chen on 2017/10/9 0009.
 */
@FeignClient("eureka-client")
public interface ConsumerFeign {
    @RequestMapping("/test")
    String consumer();
}
