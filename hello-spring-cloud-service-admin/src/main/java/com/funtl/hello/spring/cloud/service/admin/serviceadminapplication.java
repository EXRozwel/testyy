package com.funtl.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@SpringBootApplication//表明这是一个springboot应用程序
@EnableEurekaClient //Eureka客户端， 向eureka里注册一个服务
public class serviceadminapplication {
	public static void main(String[] args){
		SpringApplication.run( serviceadminapplication.class,args);
	}
//可以通过改端口号来启动多个服务来达到负载均衡的效果
}
