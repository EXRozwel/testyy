package com.funtl.spring.cloud.web.admin.ribbon.config;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //用java配置来替代原来的xml配置
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced//负载均衡注解
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}