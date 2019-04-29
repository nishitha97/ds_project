package com.distributedsystems.assignment2.repository;

import com.distributedsystems.assignment2.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User,String> {

      /**
       * find user based on username and password provided
       *
       * @param username given username of a user
       * @param password given password of a user
       * @return User
       */
      User findByUsernameAndPassword(String username,String password);



}
