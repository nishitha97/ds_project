package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.User;

import javax.validation.Valid;
import com.distributedsystems.assignment2.domain.Session;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    /**
     * create and save a user object
     *
     * @param user User object
     * @return User object
     */
    User createUser(@Valid User user);

    /**
     * updates user object
     *
     * @param user User object
     * @return updated User
     */
    User updateUser(@Valid User user);

    /**
     *find all users
     *
     * @return  List<User>
     */
    List<User> getAllUsers();

    /**
     *find user based on user id
     *
     * @param userId User id
     * @return User
     */
    Optional<User> getUser(String userId);

    /**
     *deletes a user based on id
     *
     * @param userId User id
     */
    void deleteUser(String userId);
}
