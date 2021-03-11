package com.springmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.model.Item;
import com.springmongo.model.Restaurant;
import com.springmongo.service.ItemService;
import com.springmongo.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantservice;
	@Autowired
	ItemService itemservice;
	
	@GetMapping("/")
	public List<Restaurant> getAllrestaurants(){
		return restaurantservice.getAllrestaurants();
		}
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantservice.addRestaurant(restaurant);
	}
	
	@GetMapping("/category")
	public List<Restaurant> getByCategory(@RequestParam(name = "category") String category){
		return restaurantservice.getByCategory(category);
	}
	@GetMapping("/getItems")
	public List<Item> getItems(@RequestParam("id") String id){
		return itemservice.getItems(id);
	}
	
}
