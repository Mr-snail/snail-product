package com.snail.product.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {
    // app 启动环境
    @Value("${app.env}")
    public String appEnv;

    @Value("${app.name}")
    public String appName;

    @Value("${server.port}")
    public String serverPort;


    // http 连接工具
    @Value("${http.client.request_time_out}")
    public int httpClientRequestTimeOut;

    @Value("${http.client.max_conn_per_host}")
    public int httpClientMaxConnPerHost;

    @Value("${http.client.max_conn_total}")
    public int httpClientMaxConnTotal;

    
}
