package com.springmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springmongo.model.Restaurant;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
	
	@Query(value = "{'categories':?0}")
	List<Restaurant> getByCategory(String category);

}
