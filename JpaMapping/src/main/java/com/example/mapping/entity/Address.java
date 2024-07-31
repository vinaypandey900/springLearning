package com.example.mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {
	@Id
	private int addressId;
	
	private String city;
	private String State;
	private String Country;
	
	@ManyToOne
	@JoinColumn(name="STUDENT_ADDRESS")
	private StudentEntity studentAddress;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public StudentEntity getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(StudentEntity studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Address(int addressId, String city, String state, String country, StudentEntity studentAddress) {
		super();
		this.addressId = addressId;
		this.city = city;
		State = state;
		Country = country;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", State=" + State + ", Country=" + Country
				+ ", studentAddress=" + studentAddress + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
