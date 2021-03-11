package com.springmongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class Order {
	@Id
	private String id;
	private String user;
	private String restaurantid;
	private List<OrderItems> orderItems;
	private int total;
	private String dateCreated;
	private Checkout checkout;
	public Order() {
		super();
		
	}
	public Order(String user, String restaurantid, List<OrderItems> orderItems, int total, String dateCreated,
			Checkout checkout) {
		super();
		this.user = user;
		this.restaurantid = restaurantid;
		this.orderItems = orderItems;
		this.total = total;
		this.dateCreated = dateCreated;
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
	public String getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(String restaurantid) {
		this.restaurantid = restaurantid;
	}
	public List<OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Checkout getCheckout() {
		return checkout;
	}
	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}
	
	
	
	

}
