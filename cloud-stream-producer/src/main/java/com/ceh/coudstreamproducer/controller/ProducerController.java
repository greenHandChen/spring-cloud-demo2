package com.ceh.coudstreamproducer.controller;

import com.ceh.coudstreamproducer.stream.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2018/3/7 0007.
 */
@RestController
public class ProducerController {
//    @Autowired
//    private MessageProducer.MyProducer myProducer;
//
//    @RequestMapping("/test")
//    public String testProducer() {
//        myProducer.output().send(MessageBuilder.withPayload("这是来自消息发布方的消息").build());
//        return "ok";
//    }
}
