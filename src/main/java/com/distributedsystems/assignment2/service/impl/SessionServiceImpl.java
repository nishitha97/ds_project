package com.distributedsystems.assignment2.service.impl;

import com.distributedsystems.assignment2.domain.Session;
import com.distributedsystems.assignment2.domain.User;
import com.distributedsystems.assignment2.repository.SessionRepository;
import com.distributedsystems.assignment2.repository.UserRepository;
import com.distributedsystems.assignment2.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class SessionServiceImpl implements SessionService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    SessionRepository sessionRepository;

    @Override
    public ResponseEntity<User> getSession(@Valid Session session) {

        User user=userRepository.findByUsernameAndPassword(session.getUsername(),session.getPassword());

        if(user!=null) {
            sessionRepository.save(session);
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }
}
