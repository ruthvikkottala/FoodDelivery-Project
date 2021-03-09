package com.springmongo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.springmongo.model.Login;
import com.springmongo.model.User;
import com.springmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public String createUser(User u) {
		u.setPassword(BCrypt.hashpw(u.getPassword(), BCrypt.gensalt(10)));
		User test_email=repo.findByEmail(u.getEmail());
		if(test_email !=null)
			return "User with email already exists, Try Logging in.";
		User test_username=repo.findByUsername(u.getUsername());
		if(test_username!=null) {
			return "Username already taken, Try different username.";
		}
		
		repo.save(u);
		return "User save dsuccessfully";
			
	}

	public User login(Login l) throws UsernameNotFoundException,AuthenticationException {
		User u=repo.findByUsername(l.getUsername());
		if(u==null)
			return null;
		if(BCrypt.checkpw(l.getPassword(), u.getPassword())) {
			return u;
		}
		return null;
		
	}
}
