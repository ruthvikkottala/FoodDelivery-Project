package com.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String string);

	User findByUsername(String string);

}
