package com.distributedsystems.assignment2.controller;

import com.distributedsystems.assignment2.domain.Session;
import com.distributedsystems.assignment2.domain.User;
import com.distributedsystems.assignment2.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/session")
/**
 * controller class to handle all session services
 *
 * @author IT17006880
 */
public class SessionController {

    @Autowired
    SessionService sessionService;

    /**
     * controller to handle validation of user credentials
     *
     * @param session Session object containing a username and password
     * @return ResponseEntity containing the authenticated user,else returns an unauthorized HTTP response
     */
    @PostMapping("/authenticate")
    public ResponseEntity<User> getAUser(@Valid @RequestBody Session session) {

        return sessionService.getSession(session);


    }

}


