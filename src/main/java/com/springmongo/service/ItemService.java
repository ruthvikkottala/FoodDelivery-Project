package com.springmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongo.model.Item;
import com.springmongo.model.Restaurant;
import com.springmongo.model.Review;
import com.springmongo.repository.ItemRepository;
import com.springmongo.repository.RestaurantRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepo;
	@Autowired
	RestaurantRepository restRepo; 

	public String addItem(Item i) {
		Optional<Restaurant> restaurant=restRepo.findById(i.getRestid());
		if(restaurant.isEmpty()) {
			return "No such restaurant exists. Please check the details.";
		}
		itemRepo.save(i);
		
		return "Items Successfully added.";
	}

	public String addReview(Review r) {
		Optional<Item> item=itemRepo.findById(r.getItemId());
		if(item.isEmpty())
			return "no such item exits.";
		Item i=item.get();
		i.getReviews().add(r.getData());
		itemRepo.save(i);
		return "Review successfully added.";
	}

	public String editItem(Item i) {
		Optional<Restaurant> restaurant=restRepo.findById(i.getRestid());
		if(restaurant.isEmpty()) {
			return "No such restaurant exists. Please check the details.";
		}
		itemRepo.save(i);
		
		
		return "Item edited successfully";
	}

	public List<Item> getItems(String id) {
		return itemRepo.findByRestid(id);
	}
	
	
}
