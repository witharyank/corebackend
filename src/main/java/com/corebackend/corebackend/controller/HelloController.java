package com.corebackend.corebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "✅ CoreBackend is running!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot 🚀";
    }
}
