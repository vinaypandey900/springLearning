package com.example.dtoLearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dtoLearning.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
