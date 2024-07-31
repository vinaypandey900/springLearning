package com.springBoot.RestAPI.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springBoot.RestAPI.exception.ResourceNotFoundException;
import com.springBoot.RestAPI.model.Employee;
import com.springBoot.RestAPI.repository.EmployeeRepository;
import com.springBoot.RestAPI.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepos) {
		super();
		this.employeeRepository = employeeRepos;
	}

	@Override
	public Employee savEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		
//		Optional<Employee> employee=employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "id", id);
//		}
		return employeeRepository.findById(id).orElseThrow(()->
		      new ResourceNotFoundException("Employee", "Id", id));
		
	}

	@Override
	public Employee updatEmployee(Employee employee, long id) {
		//first we need to check id is in database or not
		Employee existingemployee=employeeRepository.findById(id).orElseThrow(()->
		    new ResourceNotFoundException("Employee", "id", id));
		existingemployee.setFirstName(employee.getFirstName());
		existingemployee.setLastName(employee.getLastName());
		existingemployee.setEmail(employee.getEmail());
		//save existing employee in DB
		employeeRepository.save(existingemployee);
		return existingemployee;
	}

	@Override
	public void deleteEmployee(long id) {
		
		//check id exist or not 
		employeeRepository.findById(id).orElseThrow(()->
		    new ResourceNotFoundException("Employee", "id", id));
		
		employeeRepository.deleteById(id);
		
		
	}
}
