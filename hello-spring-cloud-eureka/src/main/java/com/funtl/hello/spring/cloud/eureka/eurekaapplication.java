package com.funtl.hello.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication//表明这是一个springboot应用程序
@EnableEurekaServer //Eureka服务端
public class eurekaapplication {

	public static void main(String[] args){
		SpringApplication.run(eurekaapplication.class,args);
	}
	
	
}
