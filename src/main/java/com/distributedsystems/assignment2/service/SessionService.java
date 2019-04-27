package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.Session;
import com.distributedsystems.assignment2.domain.User;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public interface SessionService {

    ResponseEntity<User> getSession(@Valid Session session);

}
