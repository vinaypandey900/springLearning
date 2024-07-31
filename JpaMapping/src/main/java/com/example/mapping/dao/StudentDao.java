package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entity.StudentEntity;

public interface StudentDao extends JpaRepository<StudentEntity, Integer>  {

}
