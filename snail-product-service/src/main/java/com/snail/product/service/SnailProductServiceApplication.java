package com.snail.product.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.snail.product.service.config.ApplicationConfig;
@Configuration
@ComponentScan({"com.snail.product"})
@EnableAutoConfiguration
@EnableAsync
public class SnailProductServiceApplication{


    @Autowired
    private ApplicationConfig applicationConfig;

    public static void main(String[] args){
    	SpringApplication.run(SnailProductServiceApplication.class, args);
    }

    
    /** 
     * 创建一个异步http客户请求池
     * 适用于普通请求
     * @return AsyncHttpClient 异步客户端
     */
    @Bean( name = "asyncHttpClient")
    public AsyncHttpClient createAsyncHttpClient() {
        AsyncHttpClientConfig.Builder builder = new AsyncHttpClientConfig.Builder();
        builder.setRequestTimeout(applicationConfig.httpClientRequestTimeOut);
        builder.setMaxConnectionsPerHost(applicationConfig.httpClientMaxConnPerHost);
        builder.setMaxConnections(applicationConfig.httpClientMaxConnTotal);
        return new AsyncHttpClient(builder.build());
    }


}
