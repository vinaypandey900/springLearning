package com.example.dtoLearning.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dtoLearning.dao.UserRepo;
import com.example.dtoLearning.dto.UserLocationDto;
import com.example.dtoLearning.model.Location;
import com.example.dtoLearning.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	
	//basic way to convert entityToDto
	public List<UserLocationDto> getAllUserLocations(){
		List<User>users=userRepo.findAll();
		List<UserLocationDto>userLocationDtos=new ArrayList<>();
		for(User user:users) {
			UserLocationDto u=entityToDto(user);
			userLocationDtos.add(u);
		}
		return userLocationDtos;
	}
	
	public UserLocationDto entityToDto(User user) {
		UserLocationDto userLocationDto=new UserLocationDto();
		userLocationDto.setUserId(user.getId());
		userLocationDto.setEmail(user.getEmail());
		userLocationDto.setPlace(user.getLocation().getPlace());
		userLocationDto.setLatitude(user.getLocation().getLatitude());
		userLocationDto.setLongitude(user.getLocation().getLongitude());
		return userLocationDto;
		
	}

}
