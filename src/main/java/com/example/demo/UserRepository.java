package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public List<User> userList = new ArrayList<>();

    @PostConstruct
    public void construct() {
        userList.add(new User("Jakub",
                20,
                0,
                LocalDateTime.now()
        ));
        userList.add(new User("Samuel",
                20,
                1000,
                LocalDateTime.now())
        );
    }

    List<User> getUserList() {
        return this.userList;
    }

    // TODO: return by id
}
