package com.example.airlineROS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="ROUTE")
public class Route {

	@Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "route_seq")
    @SequenceGenerator(name = "route_seq", sequenceName = "SEQ_AIRLINE_ROUTE_OPTMZ_ROUTE", allocationSize = 1)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="FLIGHT_ID")
	private Flight flight;
	
	@Column(name="START_LOC")
	private String startLoc;
	
	@Column(name="END_LOC")
	private String endLoc;
	
	@Column(name="WAYPOINTS")
	private String wayPoints;
	
	@Column(name="DISTANCE")
	private Long distance;
	
	@Column(name="FUEL_CONSUM_EST")
	private Long fuelConsumptionEst;
	
	@Column(name="EST_FLIGHT_TIME")
	private String estFlightTime;
	
	@Column(name="STATUS")
	private int status;
	
	@Column(name="OPTIMIZED")
	private int optimized;  

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getStartLoc() {
		return startLoc;
	}

	public void setStartLoc(String startLoc) {
		this.startLoc = startLoc;
	}

	public String getEndLoc() {
		return endLoc;
	}

	public void setEndLoc(String endLoc) {
		this.endLoc = endLoc;
	}

	public String getWayPoints() {
		return wayPoints;
	}

	public void setWayPoints(String wayPoints) {
		this.wayPoints = wayPoints;
	}

	public Long getDistance() {
		return distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public Long getFuelConsumptionEst() {
		return fuelConsumptionEst;
	}

	public void setFuelConsumptionEst(Long fuelConsumptionEst) {
		this.fuelConsumptionEst = fuelConsumptionEst;
	}

	public String getEstFlightTime() {
		return estFlightTime;
	}

	public void setEstFlightTime(String estFlightTime) {
		this.estFlightTime = estFlightTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int isOptimized() {
		return optimized;
	}

	public void setOptimized(int optimized) {
		this.optimized = optimized;
	}
	
	
	
}
