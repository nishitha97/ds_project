package com.distributedsystems.assignment2.service.impl;

import com.distributedsystems.assignment2.domain.Session;
import com.distributedsystems.assignment2.domain.User;
import com.distributedsystems.assignment2.repository.UserRepository;
import com.distributedsystems.assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(@Valid User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(@Valid User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);

    }
}
