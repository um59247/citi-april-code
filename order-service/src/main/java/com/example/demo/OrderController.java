package com.example.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	String createOrder(@RequestBody Order order) {
		System.out.println(order.getName());
		System.out.println("test");
		return "created successfully";
	}
	@GetMapping
	void getOrders() {
		// TODO Auto-generated method stub
		
	}
}
