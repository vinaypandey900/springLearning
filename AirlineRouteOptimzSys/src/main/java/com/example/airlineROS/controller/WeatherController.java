package com.example.airlineROS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airlineROS.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	 @Autowired
	 private WeatherService weatherService;

	    // End point to fetch weather data for a specific city and save it to the database
	    @GetMapping("/fetch/{city}")
	    public ResponseEntity<String> fetchWeatherData(@PathVariable String city) {
	        weatherService.fetchAndSaveWeatherData(city);
	        return ResponseEntity.ok("Weather data fetched and saved for city: " + city);
	    }
}
