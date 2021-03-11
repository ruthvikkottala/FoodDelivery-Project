package com.springmongo.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.model.Login;
import com.springmongo.model.LoginResult;
import com.springmongo.model.User;
import com.springmongo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService user;
	
	@PostMapping("/login")
	public LoginResult login(@RequestBody Login l) {
		
			return user.login(l);
		
	}
	
	@PostMapping("/createuser")
	public String createUser(@RequestBody User u) {
		return user.createUser(u);
	}
}
