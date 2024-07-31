package com.springCore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class employee{
     private String name;
     private List<String> phoneNumber;
     private Set<String>address;
     private Map<String, String>courses;
     private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public employee(String name, List<String> phoneNumber, Set<String> address, Map<String, String> courses,
			Properties props) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
     
     
}
