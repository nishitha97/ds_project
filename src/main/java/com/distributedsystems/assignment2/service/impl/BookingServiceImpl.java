package com.distributedsystems.assignment2.service.impl;

import com.distributedsystems.assignment2.domain.Booking;
import com.distributedsystems.assignment2.repository.BookingRepository;
import com.distributedsystems.assignment2.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public Booking createBooking(@Valid Booking booking) {
        return bookingRepository.save(booking);
    }
}
