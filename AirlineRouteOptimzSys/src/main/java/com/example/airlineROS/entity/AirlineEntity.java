package com.example.airlineROS.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "AIRLINE")
@JsonIgnoreProperties({"aircraft","flight"})
public class AirlineEntity {

	@Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airline_seq")
    @SequenceGenerator(name = "airline_seq", sequenceName = "SEQ_AIRLINE_ROUTE_OPTMZ_AIRLINE", allocationSize = 1)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name="FLEET_INFO")
	private String fleet_info;
	
	@OneToMany(mappedBy = "airline", cascade = CascadeType.ALL)
	private List<AircraftEntity> aircraft;
	
	@OneToMany(mappedBy="airlineId", cascade = CascadeType.ALL)
	private List<Flight>flight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFleet_info() {
		return fleet_info;
	}

	public void setFleet_info(String fleet_info) {
		this.fleet_info = fleet_info;
	}

	public List<AircraftEntity> getAircraft() {
		return aircraft;
	}

	public void setAircraft(List<AircraftEntity> aircraft) {
		this.aircraft = aircraft;
	}
	

	public List<Flight> getFlight() {
		return flight;
	}

	public void setFlight(List<Flight> flight) {
		this.flight = flight;
	}

	public AirlineEntity(Long id, String name, String fleet_info, List<AircraftEntity> aircraft , List<Flight>flight) {
		super();
		this.id = id;
		this.name = name;
		this.fleet_info = fleet_info;
		this.aircraft = aircraft;
		this.flight=flight;
	}

	public AirlineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
