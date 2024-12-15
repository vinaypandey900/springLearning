package com.example.airlineROS.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="WEATHER_UPDATES")
public class Weather {

	@Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WEATHER_UPDATE_seq")
    @SequenceGenerator(name = "WEATHER_UPDATE_seq", sequenceName = "SEQ_AIRLINE_ROUTE_OPTMZ_WEATHER_UPDATE", allocationSize = 1)
	private Long id;
	
	@Column(name="WEATHER_CONDITION")
	private String weatherCond;
	
	@Column(name="TEMPERATURE")
	private Double temp;
	
	@Column(name="HUMIDITY")
	private Double humdity;
	
	@Column(name="WIND_SPEED")
	private Double windSpeed;
	
	@Column(name="CITY_NAME", unique = true)
	private String city;
	
	@Column(name="DATE_TIME")
	private LocalDateTime date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWeatherCond() {
		return weatherCond;
	}

	public void setWeatherCond(String weatherCond) {
		this.weatherCond = weatherCond;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getHumdity() {
		return humdity;
	}

	public void setHumdity(Double humdity) {
		this.humdity = humdity;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime dateTime) {
		this.date = dateTime;
	}

	
	
	
	
}
