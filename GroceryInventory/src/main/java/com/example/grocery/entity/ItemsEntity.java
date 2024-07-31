package com.example.grocery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ITEMS")
public class ItemsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long itemId;
	
	@Column(name="items_Name")
	private String itemsName;
	
	@Column(name="employee_id")
	private Long empId;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public ItemsEntity(Long itemId, String itemsName, Long empId) {
		super();
		this.itemId = itemId;
		this.itemsName = itemsName;
		this.empId=empId;
		
	}

	public ItemsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ItemsEntity [itemId=" + itemId + ", itemsName=" + itemsName + ", empId=" + empId + "]";
	}	
}
