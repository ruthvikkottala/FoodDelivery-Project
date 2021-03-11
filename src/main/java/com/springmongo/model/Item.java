package com.springmongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Items")
public class Item {
	@Id
	private String id;
	private String restid;
	private String itemName;
	private int price;
	private String category;
	private String itemDetails;
	private List<String> reviews;
	public Item() {
		super();
		
	}
	public Item(String restid, String itemName, int price, String category, String itemDetails, List<String> reviews) {
		super();
		this.restid = restid;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
		this.itemDetails = itemDetails;
		this.reviews = reviews;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRestid() {
		return restid;
	}
	public void setRestid(String restid) {
		this.restid = restid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}
	public List<String> getReviews() {
		return reviews;
	}
	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}
	
	
	


}
