package com.nf.first_spring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class FirstSpringApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(FirstSpringApplication.class, args);
        System.out.println("Spring works!");

    }
        }



