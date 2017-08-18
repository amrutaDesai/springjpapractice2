package com.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class SpringjpapracticeApplication {

    public static void main(String[] args) {
       SpringApplication.run(SpringjpapracticeApplication.class, args);
    }
}
