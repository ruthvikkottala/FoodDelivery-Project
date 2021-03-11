package com.springmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.model.Item;
import com.springmongo.model.Review;
import com.springmongo.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	ItemService item;
	
	@PostMapping("/add")
	public String addItem(@RequestBody Item i) {
		return item.addItem(i);
	}
	
	@PostMapping("/addReview")
	public String addReview(@RequestBody Review r) {
		return item.addReview(r);
	}
	
	@PutMapping("/edit")
	public String editItem(@RequestBody Item i) {
		return item.editItem(i);
	}
}
