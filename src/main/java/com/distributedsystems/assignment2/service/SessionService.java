package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.Session;
import com.distributedsystems.assignment2.domain.User;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public interface SessionService {
    /**
     * used to authenticate when user logs in.checks if user is a valid user
     *
     * @param session Session object
     * @return ResponseEntity<User>
     */

    ResponseEntity<User> getSession(@Valid Session session);

}
