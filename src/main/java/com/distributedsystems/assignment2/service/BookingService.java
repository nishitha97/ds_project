package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.Booking;

import javax.validation.Valid;

public interface BookingService {
    Booking createBooking(@Valid Booking booking);
}
