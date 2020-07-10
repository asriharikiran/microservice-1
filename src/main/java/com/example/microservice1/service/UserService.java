package com.example.microservice1.service;

import com.example.microservice1.exception.OhNoException;
import com.example.microservice1.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User findUserByName(String username) {
        User user = null;
        if(null == user) {
            throw new OhNoException("user not found");
        }
        return user;
    }
}
