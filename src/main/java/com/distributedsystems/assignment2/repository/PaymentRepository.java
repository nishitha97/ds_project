package com.distributedsystems.assignment2.repository;

import com.distributedsystems.assignment2.domain.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, Integer> {
}
