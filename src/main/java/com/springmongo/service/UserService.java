package com.springmongo.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.springmongo.model.Login;
import com.springmongo.model.LoginResult;
import com.springmongo.model.User;
import com.springmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public String createUser(User u) {
		u.setPassword(BCrypt.hashpw(u.getPassword(), BCrypt.gensalt(10)));
		User testEmail=repo.findByEmail(u.getEmail());
		if(testEmail !=null)
			return "User with email already exists, Try Logging in.";
		User testUsername=repo.findByUsername(u.getUsername());
		if(testUsername!=null) {
			return "Username already taken, Try different username.";
		}
		
		repo.save(u);
		return "User save dsuccessfully";
			
	}

	public LoginResult login(Login l) {
		User u=repo.findByUsername(l.getUsername());
		if(u==null)
			return new LoginResult("","","No User exists with such credentitals, please try again.");
		if(BCrypt.checkpw(l.getPassword(), u.getPassword())) {
			return new LoginResult(u.getUserid(),u.getUsername(),"");
		}
		return new LoginResult("","","No User exists with such credentitals, please try again.");
		
	}
}
