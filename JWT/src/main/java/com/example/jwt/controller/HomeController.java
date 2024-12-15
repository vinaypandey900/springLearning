package com.example.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.model.homeModel;
import com.example.jwt.service.HomeService;


@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private HomeService homeService;

	@GetMapping("/list")
	public List<homeModel> getAll(){
		return homeService.getAllUsers();
	}
	
	
}
