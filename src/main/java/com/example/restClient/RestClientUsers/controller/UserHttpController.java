package com.example.restClient.RestClientUsers.controller;

import com.example.restClient.RestClientUsers.client.UserHttpClient;
import com.example.restClient.RestClientUsers.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/httpclient/users")
public class UserHttpController {

    private final UserHttpClient client;

    public UserHttpController(UserHttpClient client) {
        this.client = client;
    }

    @GetMapping
    List<User> findAll() {
        return client.findAll();
    }

    @GetMapping("/{id}")
    User findById(@PathVariable Integer id) {
        return client.findById(id);
    }
}
