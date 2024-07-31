package com.example.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.mapping.service.StudentService;

@SpringBootApplication
public class GroceryInventory1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(GroceryInventory1Application.class, args);
		
	    StudentService s=context.getBean(StudentService.class);
	    s.createStudent();
	}

}
