package com.example.jwt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jwt.model.homeModel;

@Service
public class HomeService {

	List<homeModel>users=new ArrayList<>();
	public HomeService() {
		users.add(new homeModel("Vinay", "1234", "vinaypandey@gmail.com"));
		users.add(new homeModel("Vinay", "1234", "vinaypandey@gmail.com"));
	}
	
	public List<homeModel>getAllUsers(){
		return users;
	}
}
