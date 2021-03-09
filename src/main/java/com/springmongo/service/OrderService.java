package com.springmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongo.model.Order;
import com.springmongo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository repo;

	public String placeOrder(Order order) {
		repo.save(order);
		return("Order placed successfully");
		
	}

	public List<Order> getOrders(String id) {
		return repo.findByUser(id);
	}

}
