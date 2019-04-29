package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.Booking;

import javax.validation.Valid;

public interface BookingService {


    /**
     * create and save a Booking object
     * @param booking object
     * @return Booking object
     */
    Booking createBooking(@Valid Booking booking);
}
