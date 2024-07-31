package com.example.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocery.dao.EmployeeDao;
import com.example.grocery.dao.ItemsDao;
import com.example.grocery.entity.EmployeeEntity;
import com.example.grocery.entity.ItemsEntity;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	

	//add new Employee details
	public void addEmployee(EmployeeEntity employeeEntity) {
		employeeDao.save(employeeEntity);
	}
	
	//see all employee details
	public List<EmployeeEntity> list() {
		return employeeDao.findAll();
	}

	//details by id
	public EmployeeEntity listById(long id) {
	    return employeeDao.findById(id).orElse(null);
	    
	}
	
	//update details
	
	public EmployeeEntity updateEmployeedetails(Long id, EmployeeEntity employeeEntity) {
		EmployeeEntity existOrNot=employeeDao.findById(id).orElse(null);
		if(existOrNot!=null) {
			existOrNot.setAge(employeeEntity.getAge());
			existOrNot.setName(employeeEntity.getName());
			existOrNot.setPhone(employeeEntity.getPhone());
			
			return employeeDao.save(existOrNot);
		}
		return null;
	}
	
	//details employee details
	public void deleteEmployee(Long id) {
		employeeDao.deleteById(id);
	}
	
	
	
}
