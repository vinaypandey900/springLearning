package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
   public static void main(String [] args) {
	   ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/collections/collectionConfig.xml");
	   
	   employee emp1=(employee)context.getBean("emp1");
	   
	   System.out.println(emp1.getName());
	   System.out.println(emp1.getPhoneNumber());
	   System.out.println(emp1.getAddress());
	   System.out.println(emp1.getCourses());
	   System.out.println(emp1.getProps());
	   System.out.println(emp1.getPhoneNumber().getClass().getName());
   }
}
