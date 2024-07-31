package com.example.mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.dao.StudentDao;
import com.example.mapping.dao.StudentIdDao;
import com.example.mapping.entity.Address;
import com.example.mapping.entity.StudentEntity;
import com.example.mapping.entity.StudentIdEntity;

import ch.qos.logback.classic.Logger;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	StudentIdDao studentIdDao;
	private static final Logger logger = (Logger) LoggerFactory.getLogger(StudentService.class);
	
	public void createStudent() {
		
		  StudentEntity std=new StudentEntity();
		  std.setId(1); 
		  std.setName("Vinay");
		  std.setRollNumber(12);
		  
		  Address a1=new Address();
		  a1.setAddressId(1);
		  a1.setCity("lko");
		  a1.setCountry("BHARAT");
		  a1.setState("UP");
		  a1.setStudentAddress(std);
		  
		  
		  Address a2=new Address();
		  a2.setAddressId(2);
		  a2.setCity("Noida");
		  a2.setCountry("BHARAT");
		  a2.setState("UP");
		  a2.setStudentAddress(std);
		  
		  
		  List<Address> list=new ArrayList<>();
		  list.add(a1);
		  list.add(a2);
		  
		  std.setAddress(list);
		  
		  
		  studentDao.save(std);
		 
		
		
	
	}
	

}
