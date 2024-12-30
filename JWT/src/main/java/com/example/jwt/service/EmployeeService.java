package com.example.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.jwt.model.Employee;

@Service
public class EmployeeService {

	private List<Employee> empList = new ArrayList<>();

    public EmployeeService() {
        empList.add(new Employee(UUID.randomUUID().toString(), "hrishab", "hrishab@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "ritesh", "ritesh@gmail.com"));
    }

    public List<Employee> getEmployeesList() {
        return empList;
    }	
}
