package com.ceh.cloudzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
//开启作为zipkin服务器
// 何谓zipkin?
// zipkin是一款基于google dapper的实现。我们可以使用他来收集，存储，搜索分布式系统的链路数据。
// 并且它对外暴露了restful 的api接口，帮助我们查询，监控链路数据，以便于我们定位请求出错的原因。
// 同时它也为我们提供了直观的UI界面，便于我们进行搜索和监控。
@EnableZipkinServer
public class CloudZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudZipkinApplication.class, args);
    }
}
