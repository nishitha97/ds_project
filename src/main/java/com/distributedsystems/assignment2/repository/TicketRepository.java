package com.distributedsystems.assignment2.repository;

import com.distributedsystems.assignment2.domain.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, Integer> {
}
