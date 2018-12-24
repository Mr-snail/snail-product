## springboot+dubbo集成


## 包含模块

1.snail-product-core：放置公用接口，该项目将被依赖snail-product-web、snail-product-service依赖
2.snail-product-parent:公用资源
3.snail-product-service：dubbo服务提供者
4.snail-product-web:dubbo消费者


## 服务端口

1. snail-product-service : 8933
2. snail-product-web : 8934

## dubbo服务提供者dubbo相关配置
snail-product-web/src/main/resources/application.properties
#Dubbo 服务消费者配置
spring.application.name = snail-product-web
#需要扫描的包
dubbo.scan.basePackages  = com.snail.product.service
#Dubbo Config properties
dubbo.application.id = snail-product-consumer
dubbo.application.name = snail-product-consumer
#ProtocolConfig Bean
dubbo.protocol.id = dubbo
dubbo.protocol.name = dubbo
dubbo.protocol.port = 20880
#这里是zk的连接配置
dubbo.registry.address = zookeeper://IP:2181



# dubbo服务消费者dubbo相关配置
#Spring boot application
spring.application.name = snail-product-service
#需要扫描的包
dubbo.scan.basePackages  = com.snail.product.service
#Dubbo Config properties
dubbo.application.id = snail-product-provider
dubbo.application.name = snail-product-provider
#ProtocolConfig Bean
dubbo.protocol.id = dubbo
dubbo.protocol.name = dubbo
dubbo.protocol.port = 20880
#这里是zk的连接配置
dubbo.registry.address = zookeeper://IP:2181

# dubbo服务提供者POM文件配置snail-product-parent/pom.xml
<dependency>
	<groupId>com.alibaba.boot</groupId>
	<artifactId>dubbo-spring-boot-starter</artifactId>
	<version>0.1.0</version>
</dependency>
<dependency>
	<groupId>com.alibaba</groupId>
	<artifactId>dubbo</artifactId>
	<version>2.6.5</version>
</dependency>

##注意：从现在开始, dubbo-spring-boot-project 将在每个发布中发行两个版本 :
0.2.x 是支持 Spring Boot 2.x 的主要版本（推荐，长期维护）
0.1.x 是支持 Spring Boot 1.x 的维护版本（兼容，短期维护）
具体查看https://github.com/apache/incubator-dubbo-spring-boot-project/blob/master/README_CN.md


## 启动项目
1、先启动提供者。右键run as snail-product-service项目的src/main/java/com/snail/product/service/SnailProductServiceApplication.java
2、再启动消费者。右键run as snail-product-web项目的src/main/java/com/snail/product/web/SnailProductWebApplication.java
#访问地址：
1、IP:8933/product/getProductList
2、IP:8933/product/sayHello
#最好是搭建一个dubbo管控台,这个就执行百度啦



