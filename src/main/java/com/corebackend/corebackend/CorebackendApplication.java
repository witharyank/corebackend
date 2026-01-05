package com.corebackend.corebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CorebackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorebackendApplication.class, args);
    }

}
