package com.distributedsystems.assignment2.repository;

import com.distributedsystems.assignment2.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User,String> {

      User findByUsernameAndPassword(String username,String password);



}
