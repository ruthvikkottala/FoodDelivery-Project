package com.springmongo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.model.Login;
import com.springmongo.model.User;
import com.springmongo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService user;
	
	@PostMapping("/login")
	public Optional<User> login(@RequestBody Login l) {
		
			return Optional.ofNullable(user.login(l));
		
	}
	
	@PostMapping("/createuser")
	public String createUser(@RequestBody User u) {
		return user.createUser(u);
	}
}
