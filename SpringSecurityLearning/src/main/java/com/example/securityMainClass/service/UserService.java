package com.example.securityMainClass.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.securityMainClass.model.UserModel;

@Service
public class UserService {

	public List<UserModel> list = new ArrayList<>();

	// to add all the users
	public UserService() {
		list.add(new UserModel("abc1", "abc1", "abc1@gmail.com"));
		list.add(new UserModel("abc2", "abc2", "abc2@gmail.com"));
		list.add(new UserModel("abc3", "abc3", "abc3@gmail.com"));
	}

	// to get all users details
	public List<UserModel> getAllUsers() {
		return list;
	}

	// Retrieve one user details
	public UserModel getUser(String name) {
		return list.stream()
				   .filter(user -> user.getUsername().equals(name))
				   .findAny()
				   .orElseThrow(() -> new RuntimeException("No username found"));
	}
	
	//add one users details
	public UserModel addSingleUser(UserModel user) {
		 list.add(user);
		 return user;
	}
}
