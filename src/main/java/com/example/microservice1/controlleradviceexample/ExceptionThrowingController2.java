package com.example.microservice1.controlleradviceexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionThrowingController2 {

    @GetMapping("/exception2")
    public String helloWorld(){
        String[] values = {"One","Two","Three","Four"};
        return values[4];
    }
}
