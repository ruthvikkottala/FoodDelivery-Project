package com.springmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongo.model.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {

	List<Item> findByRestid(String id);

}
