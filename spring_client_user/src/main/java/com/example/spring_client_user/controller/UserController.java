package com.example.spring_client_user.controller;

import com.example.spring_client_user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class UserController {

    private UserService service;

    @GetMapping("/users")
    public  String getAllUsers(){
        return service.getAllUsers().toString();
    }
}
