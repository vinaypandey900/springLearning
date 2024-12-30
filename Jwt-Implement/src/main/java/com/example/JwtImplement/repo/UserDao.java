package com.example.JwtImplement.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JwtImplement.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

	Optional<User>findByEmail(String email);
}
