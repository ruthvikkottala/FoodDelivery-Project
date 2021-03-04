package com.springmongo.model;

public class Item {
	
	private String item_name;
	private int price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String item_name, int price) {
		super();
		this.item_name = item_name;
		this.price = price;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
