package com.springBoot.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.RestAPI.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
