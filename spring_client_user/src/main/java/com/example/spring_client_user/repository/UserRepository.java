package com.example.spring_client_user.repository;

import com.example.spring_client_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer > {
}
