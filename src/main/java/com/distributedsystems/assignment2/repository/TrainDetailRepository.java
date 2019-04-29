package com.distributedsystems.assignment2.repository;

import com.distributedsystems.assignment2.domain.TrainDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainDetailRepository extends MongoRepository<TrainDetails,String> {

}
