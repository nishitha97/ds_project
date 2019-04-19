package com.distributedsystems.assignment2.repository;

import com.distributedsystems.assignment2.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {





}
