package com.example.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocery.dao.EmployeeAddedItemsDao;
import com.example.grocery.dao.EmployeeDao;
import com.example.grocery.dao.ItemsDao;
import com.example.grocery.entity.EmployeeAddedItemsEntity;
import com.example.grocery.entity.EmployeeEntity;
import com.example.grocery.entity.ItemsEntity;

@Service
public class ItemsService {

	@Autowired
	private ItemsDao itemsDao;
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private EmployeeAddedItemsDao employeeAddedItemsDao;
	
	
	//add items
	public ItemsEntity addItems(ItemsEntity itemsEntity, Long employeeId) {
		itemsEntity.setEmpId(employeeId);
		EmployeeEntity emp=employeeDao.findById(employeeId).orElse(null);
		EmployeeAddedItemsEntity empAdd=new EmployeeAddedItemsEntity();
		empAdd.setEmployeeId(employeeId);
		empAdd.setName(emp.getName());
		empAdd.setItem(itemsEntity.getItemsName());
		ItemsEntity itemsSaved=itemsDao.save(itemsEntity);
		employeeAddedItemsDao.save(empAdd);
		
		return itemsSaved;
	}
	
	// to see all items 
	public List<ItemsEntity> seeAllItems(){
		return itemsDao.findAll();
	}
	
	//see items by id
	public ItemsEntity itemById(Long id) {
		return itemsDao.findById(id).orElse(null);
	}
	
	//delete an item
	public ItemsEntity deleteItems(Long id) {
		return itemsDao.findById(id).orElse(null);
		
		
	}
	
	//update an items
	public ItemsEntity updateItems(Long id,ItemsEntity itemsEntity) {
		ItemsEntity items=itemsDao.findById(id).orElse(null);
		items.setItemsName(itemsEntity.getItemsName());
		return itemsDao.save(items);
	}
	
	
	
	
	
}
