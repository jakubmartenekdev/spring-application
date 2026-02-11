package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SomeController {
//    User users;
    UserRepository userRepository;

//    public List<User> userList;
//
//    SomeController() {
//        userList = new ArrayList<>();
//    }

//    @PostConstruct
    @Autowired
    private void initUsers(UserRepository userRepository) {
        this.userRepository = userRepository;
//        this.users = users;
//       User user = new User("Jakub", 20, 0, LocalDateTime.now());
//        User user2 = new User("Samuel", 20, 1000, LocalDateTime.now());
//        this.userList.add(user);
//        this.userList.add(user2);
    }

    @GetMapping("/employees")
    List<User> home() {
        return this.userRepository.getUserList();
    }
}
