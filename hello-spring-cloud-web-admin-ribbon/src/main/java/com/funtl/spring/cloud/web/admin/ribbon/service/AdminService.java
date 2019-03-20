package com.funtl.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class AdminService {
	
	@Autowired
    private RestTemplate restTemplate;

	
	@HystrixCommand(fallbackMethod = "hierro") //熔断机制：如果链接失败就就返回hierro方法的结果
    public String sayHi(String message) {
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);
    }
          //通过服务的名字在eureka中找到对应的ip和端口进行传参
    
    public String hierro(String message){
    	
    	
		return "Hi，your message is :\"" + message + "\" but request error.";

    	
    }
    
    
}
