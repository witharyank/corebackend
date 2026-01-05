package com.corebackend.corebackend.services.impl;

import com.corebackend.corebackend.services.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "CoreBackend is running!";
    }

    @Override
    public String sayHelloTo(String name) {
        return "Hello " + name + " 👋 ";
    }
}
