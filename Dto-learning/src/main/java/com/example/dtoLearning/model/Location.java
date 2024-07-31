package com.example.dtoLearning.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LOCATIONS")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="PLACE")
	private String place;
	
	@Column(name="DESCP")
	private String description;
	
	@Column(name="LONGI")
	private double longitude;
	
	@Column(name="LATI")
	private double latitude;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public Location(Long id, String place, String description, double longitude, double latitude) {
		super();
		this.id = id;
		this.place = place;
		this.description = description;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
