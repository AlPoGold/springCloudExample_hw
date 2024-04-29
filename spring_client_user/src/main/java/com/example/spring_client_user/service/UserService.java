package com.example.spring_client_user.service;

import com.example.spring_client_user.model.User;
import com.example.spring_client_user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository repository;


    public List<User> getAllUsers(){
        return repository.findAll();
    }

}
