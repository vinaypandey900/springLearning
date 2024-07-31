package com.example.grocery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_added_items")
public class EmployeeAddedItemsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="employeeId")
	private long employeeId;
	
	@Column(name="EmployeeName")
	private String name;
	
	@Column(name="item added")
	private String item;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public EmployeeAddedItemsEntity(Long id, long employeeId, String name, String item) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.name = name;
		this.item = item;
	}

	public EmployeeAddedItemsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeAddedItemsEntity [id=" + id + ", employeeId=" + employeeId + ", name=" + name + ", item=" + item
				+ "]";
	}
	
		
	
	
	
	
}
