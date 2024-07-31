package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entity.StudentIdEntity;

public interface StudentIdDao extends JpaRepository<StudentIdEntity, Integer>{

}
