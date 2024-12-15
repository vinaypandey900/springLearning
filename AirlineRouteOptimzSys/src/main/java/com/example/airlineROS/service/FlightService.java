package com.example.airlineROS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airlineROS.dao.AircraftDao;
import com.example.airlineROS.dao.AirlineDao;
import com.example.airlineROS.dao.FlightDao;
import com.example.airlineROS.entity.Flight;

@Service
public class FlightService {

	@Autowired
	private FlightDao flightDao;
	@Autowired
	private AirlineDao airlineDao;
	@Autowired
	private AircraftDao aircraftDao;
	
	// to add flight details
	public Flight addNewFlight(Flight flight) {
		if(airlineDao.findById(flight.getAirlineId().getId())!=null && aircraftDao.findById(flight.getAircraftId().getId())!=null){
			flightDao.save(flight);
		}
		
		return flight;
	}
	
	//to update 
	public Flight updatedFlight(Flight updateflight, Long flightId) {
		if(airlineDao.findById(updateflight.getAirlineId().getId())!=null && aircraftDao.findById(updateflight.getAircraftId().getId())!=null) {
			Flight exitingflight=flightDao.findById(flightId).get();
			
			BeanUtils.copyProperties(updateflight, exitingflight, "id");
			flightDao.save(exitingflight);
		}
		return updateflight;
	}
	
	// to get all the list of the flight 
	public List<Flight> getAllFlight(){
		return flightDao.findAll();
	}
}
