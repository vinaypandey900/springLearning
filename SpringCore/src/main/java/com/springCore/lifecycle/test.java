package com.springCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
   public static void main(String []args) {
   	     AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/lifeCycle/configLifecycle.xml");
//       beanLifecycle bl= (beanLifecycle)context.getBean("samosa");
//       System.out.println(bl);
         context.registerShutdownHook();
//       
//       System.out.println("--------------");
//       interfaceBean ib=(interfaceBean)context.getBean("pepsi");
//       System.out.println(ib);
       
         annotatioBean ab=(annotatioBean)context.getBean("annoBean");
         System.out.println(ab);
   }
}
