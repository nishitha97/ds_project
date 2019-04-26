package com.distributedsystems.assignment2.controller;

import com.distributedsystems.assignment2.domain.Payment;
import com.distributedsystems.assignment2.domain.Ticket;
import com.distributedsystems.assignment2.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    @PostMapping()
    public ResponseEntity<Ticket> addTicket(@Valid @RequestBody Ticket ticket) {

        return ResponseEntity.status(HttpStatus.CREATED).body(ticketService.createTicket(ticket));


    }


    @PutMapping()
    public ResponseEntity<Ticket> updateTicket(@Valid @RequestBody Ticket ticket) {

        return ResponseEntity.status(HttpStatus.OK).body(ticketService.updateTicket(ticket));


    }



    @GetMapping()
    public ResponseEntity<List<Ticket>> getTickets() {

        return ResponseEntity.status(HttpStatus.OK).body(ticketService.getAllTickets());


    }



    @GetMapping("/{ticketId}")
    public ResponseEntity<Optional<Ticket>> getATicket(@PathVariable("ticketId") String ticketId) {

        return ResponseEntity.status(HttpStatus.OK).body(ticketService.getTicket(ticketId));


    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{ticketId}")
    public void deleteATicket(@PathVariable("ticketId") String ticketId) {

         ticketService.deleteTicket(ticketId);


    }


}
