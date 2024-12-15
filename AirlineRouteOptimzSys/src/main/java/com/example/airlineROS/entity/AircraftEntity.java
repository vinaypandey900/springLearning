package com.example.airlineROS.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "AIRCRAFT")
public class AircraftEntity {
	
	@Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraft_seq")
    @SequenceGenerator(name = "aircraft_seq", sequenceName = "SEQ_AIRLINE_ROUTE_OPTMZ_AIRCRAFT", allocationSize = 1)
	private Long id;
	
	@Column(name = "AIRCRAFT_TYPE")
	private String airCraftType;

	@Column(name="FUEL_CAPACITY")
	private double fuelCapc;
	
	@Column(name="RANGE")
	private double range;
	
	@ManyToOne
	@JoinColumn(name="AIRLINE_ID")
	@JsonIgnore
	private AirlineEntity airline;
	
	@OneToMany(mappedBy = "aircraftId", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("aircraftId")
	private List<Flight> flight;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirCraftType() {
		return airCraftType;
	}

	public void setAirCraftType(String airCraftType) {
		this.airCraftType = airCraftType;
	}

	public double getFuelCapc() {
		return fuelCapc;
	}

	public void setFuelCapc(double fuelCapc) {
		this.fuelCapc = fuelCapc;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public AirlineEntity getAirline() {
		return airline;
	}

	public void setAirline(AirlineEntity airline) {
		this.airline = airline;
	}

	public AircraftEntity(Long id, String airCraftType, double fuelCapc, double range, AirlineEntity airline) {
		super();
		this.id = id;
		this.airCraftType = airCraftType;
		this.fuelCapc = fuelCapc;
		this.range = range;
		this.airline = airline;
	}

	public AircraftEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
