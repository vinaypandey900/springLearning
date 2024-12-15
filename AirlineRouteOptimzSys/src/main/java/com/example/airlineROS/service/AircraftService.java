package com.example.airlineROS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airlineROS.dao.AircraftDao;
import com.example.airlineROS.entity.AircraftEntity;

@Service
public class AircraftService {

	@Autowired
	private AircraftDao aircraftDao;
	
	//add new aircraft
	public AircraftEntity addAircraft(AircraftEntity aircraftEntity) {
		aircraftDao.save(aircraftEntity);
		return aircraftEntity;
	}
}
