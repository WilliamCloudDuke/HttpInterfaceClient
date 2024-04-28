package com.example.restClient.RestClientUsers.client;

import com.example.restClient.RestClientUsers.dto.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface UserHttpClient {// a better way to communicate with other restful APIs

    @GetExchange("/users")
    List<User> findAll();

    @GetExchange("/users/{id}")
    User findById(@PathVariable Integer id);
}
