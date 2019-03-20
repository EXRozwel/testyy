package com.funtl.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//这里表是具体的服务
public class controller {
	
	
	@Value("${server.port}")
	private String port;
	
	  @RequestMapping(value = "hi", method = RequestMethod.GET)  //domain
	    public String sayHi(@RequestParam(value = "message") String message) {
	        return String.format("Hi，your message is : %s i am from port : %s", message, port);
	    }

		
	}


