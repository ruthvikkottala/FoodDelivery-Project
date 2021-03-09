package com.springmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.model.Order;
import com.springmongo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping()
	public List<Order> getOrders(@RequestParam("id") String id){
		return orderService.getOrders(id);
	}
	
	@PostMapping("/placeorder")
	public String placeOrder(@RequestBody Order order) {
		return orderService.placeOrder(order);
		
	}

}
