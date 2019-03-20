package com.funtl.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;



@EnableHystrix  //开启熔断器
@EnableDiscoveryClient //注册到Eureka
@SpringBootApplication//表明这是个springboot应用程序
public class WebadminribbonApplication {
	 public static void main(String[] args) {
	        SpringApplication.run(WebadminribbonApplication.class, args);
	    }

	
	

}
