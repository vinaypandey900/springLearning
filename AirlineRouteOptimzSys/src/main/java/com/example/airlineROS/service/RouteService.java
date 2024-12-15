package com.example.airlineROS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airlineROS.dao.FlightDao;
import com.example.airlineROS.dao.RouteDao;
import com.example.airlineROS.entity.Route;

@Service
public class RouteService {

	@Autowired
	private RouteDao routeDao;
	
	//add new routes
	public Route addNewRoutes(Route route) {
		
		return routeDao.save(route);
	}
	
	//get all routes details
	public List<Route> getAllRoutes() {
		return routeDao.findAll();
	}
}
