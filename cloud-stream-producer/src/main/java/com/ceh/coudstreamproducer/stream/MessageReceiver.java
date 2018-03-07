package com.ceh.coudstreamproducer.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * Created by enHui.Chen on 2018/3/5 0005.
 */
// 指定为消息接收方或发布方
@EnableBinding(MessageReceiver.class)
public class MessageReceiver {
}
