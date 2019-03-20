package com.funtl.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;







@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer  //开启 Zipkin Server 功能，服务链路追踪
public class ZipKinApplication {
	 public static void main(String[] args) {
	        SpringApplication.run(ZipKinApplication.class, args);
	    }
}
