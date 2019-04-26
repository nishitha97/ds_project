package com.distributedsystems.assignment2.controller;

import com.distributedsystems.assignment2.domain.Ticket;
import com.distributedsystems.assignment2.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/tickets")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Ticket addTicket(@Valid @RequestBody Ticket ticket) {

        return ticketService.createTicket(ticket);


    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping()
    public Ticket updateTicket(@Valid @RequestBody Ticket ticket) {

        return ticketService.updateTicket(ticket);


    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Ticket> getTickets() {

        return ticketService.getAllTickets();


    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{ticketId}")
    public Optional<Ticket> getATicket(@PathVariable("ticketId") String ticketId) {

        return ticketService.getTicket(ticketId);


    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{ticketId}")
    public void deleteATicket(@PathVariable("ticketId") String ticketId) {

         ticketService.deleteTicket(ticketId);


    }


}
