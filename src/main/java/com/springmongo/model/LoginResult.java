package com.springmongo.model;

public class LoginResult {

	private String userId;
	private String username;
	private String error;
	public LoginResult() {
		super();
		
	}
	public LoginResult(String userId, String username, String error) {
		super();
		this.userId = userId;
		this.username = username;
		this.error = error;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}
