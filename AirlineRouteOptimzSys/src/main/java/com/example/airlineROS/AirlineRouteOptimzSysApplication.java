package com.example.airlineROS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AirlineRouteOptimzSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineRouteOptimzSysApplication.class, args);
	}

}
