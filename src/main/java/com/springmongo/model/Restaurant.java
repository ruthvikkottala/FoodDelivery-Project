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
	
	public Restaurant() {
		super();
		
	}
	public Restaurant(String name, List<String> categories) {
		super();
		this.name = name;
		this.categories = categories;
		
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
	
	

	
	
	
	
	
	

}
