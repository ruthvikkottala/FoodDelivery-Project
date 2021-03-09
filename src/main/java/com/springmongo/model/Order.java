package com.springmongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class Order {
	@Id
	private String id;
	private String user;
	private List<Order_Items> order_items;
	private int total;
	private String date_created;
	private Checkout checkout;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String user, List<Order_Items> order_items, int total, String date_created, Checkout checkout) {
		super();
		this.user = user;
		this.order_items = order_items;
		this.total = total;
		this.date_created = date_created;
		this.checkout = checkout;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public List<Order_Items> getOrder_items() {
		return order_items;
	}
	public void setOrder_items(List<Order_Items> order_items) {
		this.order_items = order_items;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getDate_created() {
		return date_created;
	}
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	public Checkout getCheckout() {
		return checkout;
	}
	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}
	
	

}
