package com.example.airlineROS.entity;




import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name="FLIGHT")
public class Flight {

	@Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flight_seq")
    @SequenceGenerator(name = "flight_seq", sequenceName = "SEQ_AIRLINE_ROUTE_OPTMZ_FLIGHT", allocationSize = 1)
	private Long id;
	
	
	@Column(name="DEPARTURE_AIRPORT")
	private String depAirport;
	
	@Column(name="ARRIVAL_AIRPORT")
	private String arvlAirport;
	
	@Column(name="DEPARTURE_TIME")
	private String depTimeString;
	
	@Column(name="ARRIVAL_TIME")
	private String arvlTimeString;
	
	@Column(name="FLIGHT_NAME")
	private String flightName;
	
	@ManyToOne
	@JoinColumn(name="AIRLINE_ID")
	@JsonIgnoreProperties("airlineId")
	private AirlineEntity airlineId;
	
	@ManyToOne
	@JoinColumn(name="AIRCRAFT_ID")
	@JsonIgnoreProperties("aircraftId")
	private AircraftEntity aircraftId;
	
	@OneToMany(mappedBy ="flight", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Route> route;
	

	public List<Route> getRoute() {
		return route;
	}

	public void setRoute(List<Route> route) {
		this.route = route;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AirlineEntity getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(AirlineEntity airlineId) {
		this.airlineId = airlineId;
	}

	public AircraftEntity getAircraftId() {
		return aircraftId;
	}

	public void setAircraftId(AircraftEntity aircraftId) {
		this.aircraftId = aircraftId;
	}

	public String getDepAirport() {
		return depAirport;
	}

	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}

	public String getArvlAirport() {
		return arvlAirport;
	}

	public void setArvlAirport(String arvlAirport) {
		this.arvlAirport = arvlAirport;
	}

	public String getDepTimeString() {
		return depTimeString;
	}

	public void setDepTimeString(String depTimeString) {
		this.depTimeString = depTimeString;
	}

	public String getArvlTimeString() {
		return arvlTimeString;
	}

	public void setArvlTimeString(String arvlTimeString) {
		this.arvlTimeString = arvlTimeString;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	
	
}
