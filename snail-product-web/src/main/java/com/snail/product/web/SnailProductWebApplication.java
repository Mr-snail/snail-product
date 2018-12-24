package com.snail.product.web;

//import javax.servlet.DispatcherType;
//import javax.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import com.snail.product.web.config.ApplicationConfig;
@Configuration
@ComponentScan({"com.snail.product"})
@EnableAutoConfiguration
@EnableAsync
public class SnailProductWebApplication  {


    @Autowired
    private ApplicationConfig applicationConfig;

    public static void main(String[] args){
    	SpringApplication.run(SnailProductWebApplication.class, args);
    }
 
 
}
