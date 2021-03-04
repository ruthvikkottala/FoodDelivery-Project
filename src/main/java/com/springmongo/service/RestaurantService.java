package com.springmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongo.model.Restaurant;
import com.springmongo.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantrepo;

	public List<Restaurant> getAllrestaurants() {
		return restaurantrepo.findAll();
	}

	public Restaurant addRestaurant(Restaurant restaurant) {
		return restaurantrepo.insert(restaurant);
	}

	public List<Restaurant> getByCategory(String category) {
		return restaurantrepo.getByCategory(category);
	}
}
