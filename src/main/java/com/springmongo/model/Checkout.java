package com.springmongo.model;

public class Checkout {
	private String name;
	private String line1;
	private String city;
	private String state;
	public Checkout() {
		super();
		
	}
	public Checkout(String name, String line1, String city, String state) {
		super();
		this.name = name;
		this.line1 = line1;
		this.city = city;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
