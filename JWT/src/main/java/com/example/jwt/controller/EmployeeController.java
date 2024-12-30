package com.example.jwt.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.model.Employee;
import com.example.jwt.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	static final org.slf4j.Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping("/list")
	private List<Employee> getAllEmployee(){
		return employeeService.getEmployeesList();
	}
}
