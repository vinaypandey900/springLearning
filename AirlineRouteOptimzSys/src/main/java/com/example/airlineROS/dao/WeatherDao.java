package com.example.airlineROS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlineROS.entity.Weather;

public interface WeatherDao extends JpaRepository<Weather, Long> {

	Weather findByCity(String city);
}
