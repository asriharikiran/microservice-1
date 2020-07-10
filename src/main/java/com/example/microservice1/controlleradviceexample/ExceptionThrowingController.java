package com.example.microservice1.controlleradviceexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionThrowingController {

    @GetMapping("/exception1")
    public Integer helloWorld(){
        Integer value = 100/0;
        return value;
    }
}
