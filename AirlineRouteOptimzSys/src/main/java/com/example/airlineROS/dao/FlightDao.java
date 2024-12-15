package com.example.airlineROS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlineROS.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Long>{

}
