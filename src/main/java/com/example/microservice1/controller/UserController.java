package com.example.microservice1.controller;

import com.example.microservice1.model.User;
import com.example.microservice1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is an example to invoke an API which is expected to have an exception in the service layer and an ideal way to handle it
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path="/user")
    public ResponseEntity<User> getUser(String username) {
        User user = userService.findUserByName(username);
        return ResponseEntity.ok()
                .header("Custom-Header", "custom-header2")
                .body(user);
    }
}
