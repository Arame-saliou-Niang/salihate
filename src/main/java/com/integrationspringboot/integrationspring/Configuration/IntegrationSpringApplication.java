package com.integrationspringboot.integrationspring.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.integrationspringboot.integrationspring")
public class IntegrationSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(IntegrationSpringApplication.class, args);
    }
}
