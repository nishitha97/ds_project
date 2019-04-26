package com.distributedsystems.assignment2.controller;

import com.distributedsystems.assignment2.domain.User;
import com.distributedsystems.assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public User addUser(@Valid @RequestBody User user) {

        return userService.createUser(user);


    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping()
    public User updateUser(@Valid @RequestBody User user) {

        return userService.updateUser(user);


    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<User> getUsers() {

        return userService.getAllUsers();


    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{userId}")
    public Optional<User> getAUser(@PathVariable("userId") String userId) {

        return userService.getUser(userId);


    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void deleteAUser(@PathVariable("userId") String userId) {

       userService.deleteUser(userId);


    }


}



