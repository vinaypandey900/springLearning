package com.example.dtoLearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtoLearning.dto.UserLocationDto;
import com.example.dtoLearning.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAll")
	public List<UserLocationDto> getAllUser(){
		return userService.getAllUserLocations();
	}

}
