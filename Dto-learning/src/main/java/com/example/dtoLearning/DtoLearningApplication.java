package com.example.dtoLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dtoLearning.dao.LocationRepo;
import com.example.dtoLearning.dao.UserRepo;
import com.example.dtoLearning.model.Location;
import com.example.dtoLearning.model.User;

@SpringBootApplication
public class DtoLearningApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoLearningApplication.class, args);
	}

	@Autowired
	LocationRepo locationRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Location location=new Location();
		location.setPlace("Lucknow");
		location.setDescription("Best place to live");
		location.setLongitude(45.55);
		location.setLatitude(87.11);
		locationRepo.save(location);
		
		
		User user1=new User();
		user1.setEmail("vinay@gmail.com");
		user1.setfName("Vinay");
		user1.setlName("Pandey");
		user1.setPassword("123");
		user1.setLocation(location);
		userRepo.save(user1);
		
		User user2=new User();
		user2.setEmail("ajay@gmail.com");
		user2.setfName("ajay");
		user2.setlName("tiwari");
		user2.setPassword("123");
		user2.setLocation(location);
		userRepo.save(user2);
		
		
	}

}
