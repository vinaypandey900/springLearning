package com.example.airlineROS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlineROS.entity.AircraftEntity;

public interface AircraftDao extends JpaRepository<AircraftEntity, Long> {

}
