package com.ceh.coudstreamproducer.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;


/**
 * Created by enHui.Chen on 2018/3/7 0007.
 */
// 这个注解需要一个或多个带有带有@Input注解或带有@Output注解的接口，以实现对消息通道的绑定
@EnableBinding(value = {MessageProducer.MyProducer.class,Source.class})
public class MessageProducer {

    @Bean
    @InboundChannelAdapter(value = MyProducer.OUTPUT,poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<>("测试");
    }


    // 定义输出流通道
    public interface MyProducer {
        // 针对于输出通道来说，交换机与消息的routing key都是myOutput
        String OUTPUT = "myOutput";

        @Output(MyProducer.OUTPUT)
        MessageChannel output();
    }
}

