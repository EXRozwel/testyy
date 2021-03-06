package com.funtl.hello.spring.cloud.zuul.provider;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class WebAdminFeignFallbackProvider implements FallbackProvider{

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		// TODO Auto-generated method stub
		return   new ClientHttpResponse(){

			@Override
			public InputStream getBody() throws IOException {
				 ObjectMapper objectMapper = new ObjectMapper();
	                Map<String, Object> map = new HashMap<>();
	                map.put("status", 200);
	                map.put("message", "无法连接，请检查您的网络");
	                return new ByteArrayInputStream(objectMapper.writeValueAsString(map).getBytes("UTF-8"));

			}

			@Override
			public HttpHeaders getHeaders() {
				 HttpHeaders headers = new HttpHeaders();
	                // 和 getBody 中的内容编码一致
	                headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
	                return headers;

			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getRawStatusCode() throws IOException {
				 return HttpStatus.OK.value();

			}

			@Override
			public HttpStatus getStatusCode() throws IOException {
				 return HttpStatus.OK;

			}

			@Override
			public String getStatusText() throws IOException {
				return HttpStatus.OK.getReasonPhrase();

			}
		};
	}	
		
	

	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return "hello-spring-cloud-web-admin-feign";
	}

}
