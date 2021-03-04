package com.springmongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Restaurants")
public class Restaurant {
	@Id
	private String id;
	private String name;
	private List<String> categories;
	private List<Item> items;
	private int rating;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(String name, List<String> categories, List<Item> items, int rating) {
		super();
		this.name = name;
		this.categories = categories;
		this.items = items;
		this.rating = rating;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
	

}
