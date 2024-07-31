package com.springCore.standAlone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/standAlone/collections/standaloneconfig.xml");
		person p=context.getBean("person1", person.class);
		System.out.println(p.getFriends());
		System.out.println(p.getFeeStructre());
		System.out.println(p.getProperties());
		
		

	}

}
