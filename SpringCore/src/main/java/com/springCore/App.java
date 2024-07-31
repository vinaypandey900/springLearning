package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //we are not creating the object we are telling the container so that we get the object 
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        // student object
        student student1=(student)context.getBean("student1");
        student student2=(student)context.getBean("student2");
        //toString method is used to print the property value if not use then hashcode will print
        System.out.println(student1);
        System.out.println(student2);
    }
}
