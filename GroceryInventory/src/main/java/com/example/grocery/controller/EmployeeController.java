package com.example.grocery.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grocery.customeResponse.ResponseMessage;
import com.example.grocery.entity.EmployeeEntity;
import com.example.grocery.entity.ItemsEntity;
import com.example.grocery.service.EmployeeService;
import com.example.grocery.service.ItemsService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	/************Employee Controller*************/
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add")
	public void addEmployee(@RequestBody EmployeeEntity employeeEntity) {
		employeeService.addEmployee(employeeEntity);
	}
	
	@GetMapping("/list")
	public  List<EmployeeEntity> listEmployee() {
		return employeeService.list();
	}

	@GetMapping("/list/{id}")
	public EmployeeEntity listByid(@PathVariable Long id) {
		return employeeService.listById(id);
	}
	
	@PostMapping("/update/{id}")
	public EmployeeEntity updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity employeeEntity) {
		return employeeService.updateEmployeedetails(id, employeeEntity);
	}
	
	@GetMapping("/delete/{id}")
	public void deleteId(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}
	
	
	
	/************Items Controller*************/
	
	@Autowired
	private ItemsService itemsService;
	
	@PostMapping("/items/add/{empId}")
	public ResponseEntity<ResponseMessage<ItemsEntity>> addItems(@RequestBody ItemsEntity itemsEntity,@PathVariable Long empId) {
		
	    ResponseMessage<ItemsEntity> message=new ResponseMessage<>("Item added Successfully", itemsService.addItems(itemsEntity, empId));
		return ResponseEntity.ok(message);
	}
	
	@GetMapping("/items/allItems")
	public List<ItemsEntity> getAllItems() {
		return itemsService.seeAllItems();
	}
	
	@GetMapping("/items/{id}")
	public ItemsEntity getItemById(@PathVariable Long id) {
		return itemsService.itemById(id);
	}
	
	@PostMapping("/items/update/{id}")
	public ItemsEntity updateItems(@PathVariable Long id, @RequestBody ItemsEntity itemsEntity) {
		return itemsService.updateItems(id, itemsEntity);
	}
	
	@GetMapping("/items/delete/{id}")
	public ItemsEntity deleteItems(@PathVariable Long id) {
		return itemsService.deleteItems(id);
	}
}
