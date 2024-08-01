package com.example.dtoLearning.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.mapping.Map;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
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
	@Autowired
	ModelMapper modelMapper;
	
	
/*********basic way to convert entityToDto***********/
	
	
		//	public List<UserLocationDto> getAllUserLocations(){
		//		List<User>users=userRepo.findAll();
		//		List<UserLocationDto>userLocationDtos=new ArrayList<>();
		//		for(User user:users) {
		//			UserLocationDto u=entityToDto(user);
		//			userLocationDtos.add(u);
		//		}
		//		return userLocationDtos;
		//	}
			
		//	public UserLocationDto entityToDto(User user) {
		//		UserLocationDto userLocationDto=new UserLocationDto();
		//		userLocationDto.setUserId(user.getId());
		//		userLocationDto.setEmail(user.getEmail());
		//		userLocationDto.setPlace(user.getLocation().getPlace());
		//		userLocationDto.setLatitude(user.getLocation().getLatitude());
		//		userLocationDto.setLongitude(user.getLocation().getLongitude());
		//		return userLocationDto;
		//		
		//	}
	
	
/**************   Second way to this  ***************/
	
//			public List<UserLocationDto>getAllUsersLocations(){
//				// Retrieve all user entities from the repository
//				return userRepository.findAll()  // Call the findAll() method of userRepository to get a list of all UserEntity objects
//				    .stream()  // Convert the list of UserEntity objects into a Stream for processing
//				    .map(this::convertEntityToDto)  // Use the map() function to transform each UserEntity into a UserLocationDTO
//				    // The map() function applies the convertEntityToDto method to each element in the stream
//				    // this::convertEntityToDto is a method reference to the convertEntityToDto method in the current class
//				    .collect(Collectors.toList());  // Collect the transformed UserLocationDTO objects into a List and return it
//				    // Collectors.toList() gathers the stream elements into a new List
//		
//			}
	
//	
//	public UserLocationDto entityToDto(User user) {
//		UserLocationDto userLocationDto=new UserLocationDto();
//		userLocationDto.setUserId(user.getId());
//		userLocationDto.setEmail(user.getEmail());
//		userLocationDto.setPlace(user.getLocation().getPlace());
//		userLocationDto.setLatitude(user.getLocation().getLatitude());
//		userLocationDto.setLongitude(user.getLocation().getLongitude());
//		return userLocationDto;
//		
//	}
	
/******************Third way, Use ModelMapper to do this**************************/
	
	public List<UserLocationDto>getAllUsersLocations(){
		return userRepo.findAll()
				       .stream()
				       .map(this::entityToDto)
				       .collect(Collectors.toList());
	}
	
	private UserLocationDto entityToDto(User user) {
		modelMapper.getConfiguration()
		           .setMatchingStrategy(MatchingStrategies.LOOSE);
		UserLocationDto userLocationDto=modelMapper.map(user, UserLocationDto.class);
		return userLocationDto;
	}
	
	
	private User convertDtoToEntity(UserLocationDto userLocationDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        User user = new User();
        user = modelMapper.map(userLocationDTO, User.class);
        return user;
    }
	
	

}
