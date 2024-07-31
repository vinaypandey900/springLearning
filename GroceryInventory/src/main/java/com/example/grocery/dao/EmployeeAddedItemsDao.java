package com.example.grocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocery.entity.EmployeeAddedItemsEntity;

public interface EmployeeAddedItemsDao extends JpaRepository<EmployeeAddedItemsEntity, Long> {

}
