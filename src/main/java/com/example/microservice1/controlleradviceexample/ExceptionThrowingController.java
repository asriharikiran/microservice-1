package com.example.microservice1.controlleradviceexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionThrowingController {

    @GetMapping("/exception1")
    public Integer helloWorld(){
        // Exception raised here is handled in the "handler.ExceptionHandler" class as it handles all exceptions of type Arithmetic Exception
        Integer value = 100/0;
        return value;
    }
}
