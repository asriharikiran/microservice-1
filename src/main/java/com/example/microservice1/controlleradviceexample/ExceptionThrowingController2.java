package com.example.microservice1.controlleradviceexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionThrowingController2 {

    @GetMapping("/exception2")
    public String helloWorld(){
        String[] values = {"One","Two","Three","Four"};
        // The exception thats raised here is not handled any where. This can be configured to be handled in handler.ExceptionHandler.
        return values[4];
    }
}
