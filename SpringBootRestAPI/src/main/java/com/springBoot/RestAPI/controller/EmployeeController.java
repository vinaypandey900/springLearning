package com.springBoot.RestAPI.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.RestAPI.model.Employee;
import com.springBoot.RestAPI.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	//inject dependency 
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	//build create employee REST API
	@PostMapping
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.savEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping
	//build get all employee REST API
	 public List<Employee>getAllEmployees(){
		 return employeeService.getAllEmployees();
	 }
	
	
	//Build get Employee by id REST API
	//http://localhost:8080/api/employee/1
	@GetMapping("{id}")
	public ResponseEntity<Employee>getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
	}
	
	//build update Employee REST API
	////http://localhost:8080/api/employee/1
	@PutMapping("{id}")
	public ResponseEntity<Employee>updateEmployee(@PathVariable("id") long id
			                                                      ,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updatEmployee(employee, id), HttpStatus.OK);
	}
	
	
	//build Delete Employee REST API
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("id") long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee record is deleted", HttpStatus.OK);
	}
	
}
