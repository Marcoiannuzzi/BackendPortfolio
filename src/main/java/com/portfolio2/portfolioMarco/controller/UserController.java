package com.portfolio2.portfolioMarco.controller;

import com.portfolio2.portfolioMarco.model.User;
import com.portfolio2.portfolioMarco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class UserController {
    final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/user/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }
}
