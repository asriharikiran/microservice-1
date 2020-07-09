package com.example.microservice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/greeting")
    public String helloWorld(){
        return "Hello World!!";
    }
}
