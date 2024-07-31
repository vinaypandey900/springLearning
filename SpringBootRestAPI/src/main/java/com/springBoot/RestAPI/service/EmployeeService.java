package com.springBoot.RestAPI.service;

import java.util.List;

import com.springBoot.RestAPI.model.Employee;

public interface EmployeeService {
   Employee savEmployee(Employee employee);
   List<Employee> getAllEmployees();
   Employee getEmployeeById(long id);
   Employee updatEmployee(Employee employee, long id);
   void deleteEmployee(long id);
}
