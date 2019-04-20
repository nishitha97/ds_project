package com.distributedsystems.assignment2.service.impl;

import com.distributedsystems.assignment2.domain.Ticket;
import com.distributedsystems.assignment2.repository.TicketRepository;
import com.distributedsystems.assignment2.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket createTicket(@Valid Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(@Valid Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> getTicket(String ticketId) {
        return ticketRepository.findById(Integer.parseInt(ticketId));
    }

    @Override
    public void deleteTicket(String ticketId) {
        ticketRepository.deleteById(Integer.parseInt(ticketId));
    }
}
