package com.springmongo.model;

public class Order_Items {
	private String item_name;
	private int price;
	private int quantity;
	public Order_Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order_Items(String item_name, int price, int quantity) {
		super();
		this.item_name = item_name;
		this.price = price;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
