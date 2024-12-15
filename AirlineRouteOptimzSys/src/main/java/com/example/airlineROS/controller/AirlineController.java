package com.example.airlineROS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airlineROS.entity.AircraftEntity;
import com.example.airlineROS.entity.AirlineEntity;
import com.example.airlineROS.service.AircraftService;
import com.example.airlineROS.service.AirlineService;

@RestController
@RequestMapping("/airline")
public class AirlineController {

	@Autowired
	private AirlineService airlineService;
	
	
    // add new airline only
	@PostMapping("/addAirlineOnly")
	private AirlineEntity addNewAirlineOnly(@RequestBody AirlineEntity airlineEntity) {
		return airlineService.addAirlineOnly(airlineEntity);
	}
	
	
	
	//to add new airline with aircrafts
	@PostMapping("/add")
	private AirlineEntity addNewAirline(@RequestBody AirlineEntity airlineEntity) {
		
		return airlineService.addAirline(airlineEntity);
	}
	
	@GetMapping("/list")
	private List<AirlineEntity>getAllAirline(){
		return airlineService.getAllAirline();
	}
	@GetMapping("/list/{name}")
	private AirlineEntity getAirlineByName(@PathVariable String name) {
		return airlineService.getListOfAirlineByName(name);
	}
	
	@DeleteMapping("/delete/{id}")
	private AirlineEntity deleteById(@PathVariable Long id ) {
		return airlineService.deleteById(id);
	}
	
	//add new aircraft only with existing airline
	@PostMapping("/aircraft/add/{airlineId}")
	private List<AircraftEntity> addNewAircraft(@PathVariable Long airlineId, @RequestBody List<AircraftEntity> aircraftEntity) {
		return airlineService.addNewAircraft(airlineId,aircraftEntity);
	}

	
}
