package com.ceh.cloudstreamreceiver.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by enHui.Chen on 2018/3/5 0005.
 */
// @EnableBind注解需要一个带有@Input或者@Output注解的接口，以实现与消息信道(通道)的绑定
// 工作整体原理:消息的生产方通过消息输出通道把消息推到交换机，交换机根据消息的routing key以及bingding规则把消息推到对应的主题或队列，消息接受方监听输入通道完成消息接收
@EnableBinding(MyReceiver.class)
public class MessageReceiver {
    private final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);

    // 指定监听的队列,接收到的数据是byte[]类型，需要进行解码
    @StreamListener(MyReceiver.INPUT)
    public void myReceiver(Object object) {
        logger.info(object.toString());
    }
}
