package com.example.microservice1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Oh No User Not Found")
public class OhNoException extends RuntimeException {
    public OhNoException(String message) {
        super(message);
    }
}
