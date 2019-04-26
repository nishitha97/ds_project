package com.distributedsystems.assignment2.repository;

import com.distributedsystems.assignment2.domain.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends MongoRepository<Ticket, String> {
}
