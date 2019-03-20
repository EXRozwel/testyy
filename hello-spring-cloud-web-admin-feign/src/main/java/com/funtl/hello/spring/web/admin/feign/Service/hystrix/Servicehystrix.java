package com.funtl.hello.spring.web.admin.feign.Service.hystrix;

import org.springframework.stereotype.Component;

import com.funtl.hello.spring.web.admin.feign.Service.service;

@Component
public class Servicehystrix implements service {

	@Override
	public String sayHi(String message) {
		// TODO Auto-generated method stub
		 return "Hi，your message is :\"" + message + "\" but request error.";

	}

}
