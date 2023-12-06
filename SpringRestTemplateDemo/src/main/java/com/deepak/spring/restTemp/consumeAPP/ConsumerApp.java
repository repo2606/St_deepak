package com.deepak.spring.restTemp.consumeAPP;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/consume")
public class ConsumerApp {
	
	private RestTemplate restTemplate;
	
	
	
	@GetMapping("/products")
	public List<Object> getListofProduct(){
		
		String url = "http://localhost:9191/products";
		
		Object[] listofObjects = restTemplate.getForObject(url, Object[].class);
		
		return Arrays.asList(listofObjects);
	}
	
	

}
