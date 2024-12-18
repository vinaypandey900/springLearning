package com.example.securityMainClass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.securityMainClass.model.UserModel;
import com.example.securityMainClass.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	//to get all the users
	@GetMapping("/getUsers")
	private List<UserModel> addUsers(){
		return userService.getAllUsers();
	}

	//to get one user details using name
	@GetMapping("/{oneUser}")
	private UserModel getOneUserdetails(@PathVariable("oneUser") String userName) {
		return userService.getUser(userName);
	}

	//add single user
	@PostMapping("/addOneUser")
	private UserModel addSingleUser(@RequestBody UserModel user) {
		return userService.addSingleUser(user);
	}

	//delete single user
	@DeleteMapping("/delete/{Id}")
	private UserModel deleteSingleUser(@PathVariable int id) {
		return userService.deleteOneUser(id);
	}
}
