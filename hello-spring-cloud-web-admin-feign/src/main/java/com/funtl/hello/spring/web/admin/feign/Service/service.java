package com.funtl.hello.spring.web.admin.feign.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.funtl.hello.spring.web.admin.feign.Service.hystrix.Servicehystrix;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = Servicehystrix.class)//通过服务名来调用所需的服务,熔断类
//Feign的作用在于编写web客户端更加简单，使用Feign时需要创建一个接口
public interface service {
	@RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
