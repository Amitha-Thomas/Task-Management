package com.bookauthor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookauthor.entity.User;


public interface UserRepository extends MongoRepository<User, Integer> {

}
