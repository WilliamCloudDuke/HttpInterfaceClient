package com.example.restClient.RestClientUsers.controller;

import com.example.restClient.RestClientUsers.client.UserRestClient;
import com.example.restClient.RestClientUsers.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private final UserRestClient client;


    public UserController(UserRestClient client) {
        this.client = client;
    }


    @GetMapping("")
    public List<User> findAll() {
        return client.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return client.findById(id);
    }

}
