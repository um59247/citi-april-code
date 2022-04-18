package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	RestTemplate restTemplate = new RestTemplate();
	@GetMapping
	void callOrder() {
		Order order = new Order();
		order.setName("Laptop");
		order.setPrice(344.8F);
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/order", order, String.class);
		System.out.println(response.getStatusCodeValue());
	}
}
