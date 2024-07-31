package com.springCore.lifecycle;

public class beanLifecycle {
    private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("Setting Properties");
		this.price = price;
	}

	public beanLifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "beanLifecycle [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init() method");
	}
	public void destroy() {
		System.out.println("Inside destroy() method");
		
	}
    
}
