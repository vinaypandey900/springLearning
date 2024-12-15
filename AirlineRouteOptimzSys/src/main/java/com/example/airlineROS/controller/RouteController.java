package com.example.airlineROS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airlineROS.entity.Route;
import com.example.airlineROS.service.RouteService;

@RestController
@RequestMapping("/route")
public class RouteController {

	@Autowired
	private RouteService routeService;
	//add new route 
	@PostMapping("/addNewRoute")
	private Route addNewRoute(@RequestBody Route route) {
	    routeService.addNewRoutes(route);
	    return route;
	}
	
	//get all the routes
	
	@GetMapping("/list")
	private List<Route> getAllRoutes(){
		return routeService.getAllRoutes();
	}

}
