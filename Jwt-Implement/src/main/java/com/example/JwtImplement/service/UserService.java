package com.example.JwtImplement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.JwtImplement.entity.User;
import com.example.JwtImplement.repo.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	//create a single user details
	public User createUser(User users) {
		users.setCreatedAt(LocalDateTime.now());
		System.out.println("Created At: " + users.getCreatedAt());
		return userDao.save(users);
	}
	
	
	
	//get all users list
	public List<User> getAllUsers(){
		return userDao.findAll();
	}

}
