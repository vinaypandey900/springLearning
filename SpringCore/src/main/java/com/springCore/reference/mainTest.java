package com.springCore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/reference/ReferenceConfig.xml");
	     A a=(A)context.getBean("aref");
	     System.out.println(a.getX());
	     System.out.println(a.getOb().getY());
	     System.out.println(a);
	     
	}

}
