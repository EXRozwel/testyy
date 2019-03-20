package com.funtl.hello.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;




@SpringBootApplication
@EnableEurekaClient 
@EnableZuulProxy //开启zuul功能
public class zuulapplication {
	  public static void main(String[] args) {
	        SpringApplication.run(zuulapplication.class, args);
	    }
	  
	  //提供统一服务入口并能直接路由到对应的服务
}
