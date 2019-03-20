package com.funtl.hello.spring.web.admin.feign.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.funtl.hello.spring.web.admin.feign.Service.service;



public class Controller {
	 @Autowired
	    private service service;

	    @RequestMapping(value = "hi", method = RequestMethod.GET)
	    public String sayHi(@RequestParam String message) {
	        return service.sayHi(message);
	    }

	

}
