package com.distributedsystems.assignment2.controller;


import com.distributedsystems.assignment2.domain.Booking;
import com.distributedsystems.assignment2.domain.User;
import com.distributedsystems.assignment2.service.BookingService;
import com.distributedsystems.assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;


    @PostMapping()
    public ResponseEntity<Booking> addBooking(@Valid @RequestBody Booking booking) {

        return ResponseEntity.status(HttpStatus.CREATED).body(bookingService.createBooking(booking));


    }
}