package com.example.JwtImplement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JwtImplement.entity.User;
import com.example.JwtImplement.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	//create user details
	@PostMapping("/create")
	private User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	//return authenticate users
	@GetMapping("/me")
	public ResponseEntity<User>authenticateUser(){
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		User currentUser=(User)authentication.getPrincipal();
		return ResponseEntity.ok(currentUser);
	}
	
	//get All users
	@GetMapping("/getUsers")
	private List<User>getAllUsers(){
		return userService.getAllUsers();
	}
	
}
