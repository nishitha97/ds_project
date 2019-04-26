package com.distributedsystems.assignment2.controller;

import com.distributedsystems.assignment2.domain.User;
import com.distributedsystems.assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    @PostMapping()
    public ResponseEntity<User> addUser(@Valid @RequestBody User user) {

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));


    }

    @PutMapping()
    public ResponseEntity<User> updateUser(@Valid @RequestBody User user) {

        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(user));


    }


    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());


    }


    @GetMapping("/{userId}")
    public ResponseEntity<Optional<User>> getAUser(@PathVariable("userId") String userId) {

        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(userId));


    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void deleteAUser(@PathVariable("userId") String userId) {

       userService.deleteUser(userId);


    }


}



