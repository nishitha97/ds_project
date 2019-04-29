package com.distributedsystems.assignment2.controller;

import com.distributedsystems.assignment2.domain.User;
import com.distributedsystems.assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.Session;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/users")
/**
 * controller class to handle all user services
 *
 * @author IT17006880
 */
public class UserController {

    @Autowired
    UserService userService;

    /**
     * controller for creating a new user
     *
     * @param user User object
     * @return ResponseEntity containing the created user
     */
    @PostMapping()
    public ResponseEntity<User> addUser(@Valid @RequestBody User user) {

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));

    }

    /**
     * controller to update a user
     *
     * @param user User object
     * @return ResponseEntity containing the updated user
     */
    @PutMapping()
    public ResponseEntity<User> updateUser(@Valid @RequestBody User user) {

        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(user));

    }

    /**
     * controller to return all users available
     *
     * @return ResponseEntity containing the list of users
     */
    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());

    }

    /**
     * controller to find and return a specific user based on the user id
     *
     * @param userId User id
     * @return ResponseEntity containing the list of users
     */
    @GetMapping("/{userId}")
    public ResponseEntity<Optional<User>> getAUser(@PathVariable("userId") String userId) {

        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(userId));

    }

    /**
     * controller to delete a specific user given the id
     *
     * @param userId User id
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void deleteAUser(@PathVariable("userId") String userId) {

       userService.deleteUser(userId);

    }

}



