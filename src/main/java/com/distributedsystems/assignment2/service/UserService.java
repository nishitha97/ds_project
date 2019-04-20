package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.User;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(@Valid User user);

    User updateUser(@Valid User user);

    List<User> getAllUsers();

    Optional<User> getUser(String userId);

    void deleteUser(String userId);
}
