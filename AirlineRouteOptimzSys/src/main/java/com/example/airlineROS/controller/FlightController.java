package com.example.airlineROS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airlineROS.entity.Flight;
import com.example.airlineROS.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	//to add new flight
	@PostMapping("/addNewFlight")
	private Flight addNewFlight(@RequestBody Flight flight) {
		return flightService.addNewFlight(flight);
	}
	
	//to update flight
	@PostMapping("/update/{flightId}")
	private Flight updateFlight(@RequestBody Flight flight,@PathVariable Long flightId) {
		return flightService.updatedFlight(flight, flightId);
	}
	
	//to return list of all the flight
	@GetMapping("/list")
	private List<Flight>getAllFlight(){
		return flightService.getAllFlight();
	}
}
