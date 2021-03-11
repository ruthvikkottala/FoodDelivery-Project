package com.springmongo.model;

public class Review {
	private String itemId;
	private String data;
	public Review() {
		super();
		
	}
	public Review(String itemId, String data) {
		super();
		this.itemId = itemId;
		this.data = data;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
