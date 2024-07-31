package com.springCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
   public static void main(String[] args) {
	   ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/constructorInjection/configCI.xml");
	   person p=(person)context.getBean("person");
	   System.out.println(p);
	   
	   adition add=(adition)context.getBean("add");
	   add.doSum();
   }
}
