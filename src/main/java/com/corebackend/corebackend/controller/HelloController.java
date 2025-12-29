package com.corebackend.corebackend.controller;

import com.corebackend.corebackend.service.HelloService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    // GET http://localhost:8080/api
    @GetMapping
    public String home() {
        return helloService.sayHello();
    }

    // GET http://localhost:8080/api/hello?name=Kumar
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.sayHelloTo(name);
    }
}
