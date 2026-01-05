package com.corebackend.corebackend.controller;

import com.corebackend.corebackend.dto.HelloRequest;
import com.corebackend.corebackend.services.HelloService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    // GET http://localhost:8080/hello
    @GetMapping
    public String home() {
        return "Hola";
    }

    // POST http://localhost:8080/hello
    @PostMapping
    public String sayHello(@RequestBody HelloRequest request) {
        return helloService.sayHelloTo(request.getName());
    }
}
