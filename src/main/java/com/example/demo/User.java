package com.example.demo;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

//@Component
public record User(String name, int age, int salary, LocalDateTime dateTime) {

//    User {
//        this.dateTime = LocalDateTime.now();
//    }
}
