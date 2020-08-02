package com.example.boot;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class SimpleWebApp {
    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApp.class, args);
    }
    @RequestMapping("/")
    public String greetings(){
        return "<h1>Spring Boot Rocks in Java too!</h1>";
    }
}