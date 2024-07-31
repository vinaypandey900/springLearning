package com.example.dtoLearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dtoLearning.model.Location;

public interface LocationRepo extends JpaRepository<Location, Long> {

}
