package com.funtl.hello.spring.web.admin.feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableHystrixDashboard   //配置熔断仪表盘
@SpringBootApplication
@EnableDiscoveryClient  //注册到eureka
@EnableFeignClients   //feign 客户端
public class WebAdminFeignApplication {
	   public static void main(String[] args) {
	        SpringApplication.run(WebAdminFeignApplication.class, args);
	    }

//localhost:8765/hystrix/到配置熔断仪表盘
}
