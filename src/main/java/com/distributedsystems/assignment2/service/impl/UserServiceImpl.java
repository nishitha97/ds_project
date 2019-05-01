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

        user.setCreditCardNo(replaceFirst13Digits(user.getCreditCardNo()));
        return userRepository.save(user);
    }

    //For security reasons only last 3 digits of credit card number will be stored in the database
    //Also cvc number and account holders number will not be stored for security reasons
    private String replaceFirst13Digits(String s){

        return "****"+s.substring(13);
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
        Optional<User> user=userRepository.findById(userId);
        String creditCardNo=user.get().getCreditCardNo();
        String last3digits=creditCardNo.substring(creditCardNo.length()-3);
        user.get().setCreditCardNo(last3digits);
        return user;

    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);

    }
}
