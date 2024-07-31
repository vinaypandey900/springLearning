package com.springCore.autowiringXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/autowiringXml/autoconfig.xml");
		// if i dont want to type case then in getBean method i have to their class type 
		emp emp1=context.getBean("employee", emp.class);
		System.out.println(emp1);

	}

}
