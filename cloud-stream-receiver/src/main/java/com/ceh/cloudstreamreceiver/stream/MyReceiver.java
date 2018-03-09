package com.ceh.cloudstreamreceiver.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by enHui.Chen on 2018/3/7 0007.
 */
// 定义消息输入流通道
public interface MyReceiver {
    // 针对于输入通道来说，默认exchange类型是topic名称为myInput，且binding规则为myInput.#;并且队列名称也为myInput开头
    String INPUT = "myInput";

    @Input(MyReceiver.INPUT)
    SubscribableChannel input();
}
