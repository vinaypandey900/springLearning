package com.example.airlineROS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airlineROS.dao.AircraftDao;
import com.example.airlineROS.dao.AirlineDao;
import com.example.airlineROS.entity.AircraftEntity;
import com.example.airlineROS.entity.AirlineEntity;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class AirlineService {

	@Autowired
	private AirlineDao airlineDao;
	
	@Autowired
	private AircraftDao aircraftDao;
	
	//to add new airline only no aircraft
	public AirlineEntity addAirlineOnly(AirlineEntity airline ) {
		return airlineDao.save(airline);
	}
	
	
	//to add new airline with aircrafts
	public AirlineEntity addAirline(AirlineEntity airlineEntity) {
		
		for(AircraftEntity a:airlineEntity.getAircraft()) {
			a.setAirline(airlineEntity);
		}
		return airlineDao.save(airlineEntity);
		
	}
	
	//to get all airline records
	
	public List<AirlineEntity> getAllAirline() {
		return airlineDao.findAll();
		
	}
	
	//to get airline details by name
	public AirlineEntity getListOfAirlineByName(String name){
		return airlineDao.findByName(name);
		
	}
	//delete an airline by their id
	public AirlineEntity deleteById(Long id) {
		AirlineEntity air=airlineDao.findById(id).orElse(null);
		 airlineDao.deleteById(id);
		 return air;
	}
	
	//add new aircraft with existing airline
	public List<AircraftEntity> addNewAircraft(Long airlineId, List< AircraftEntity> aircraftBody) {
		AirlineEntity airlineEntity=airlineDao.findById(airlineId).orElse(null);
		for(AircraftEntity a: aircraftBody)
		{
			a.setAirline(airlineEntity);
			aircraftDao.save(a);
		}
		return aircraftBody;
	}
	
}
