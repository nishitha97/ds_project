package com.distributedsystems.assignment2.repository;


import com.distributedsystems.assignment2.domain.Session;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SessionRepository extends MongoRepository<Session,String>{


}
