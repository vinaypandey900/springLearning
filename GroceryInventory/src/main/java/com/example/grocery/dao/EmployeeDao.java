package com.example.grocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocery.entity.EmployeeEntity;

public interface EmployeeDao extends JpaRepository<EmployeeEntity, Long> {

}
