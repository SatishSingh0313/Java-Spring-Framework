package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {
	public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("cycle.xml");
    
    Cycle c = (Cycle) context.getBean("myCycle");
    
      System.out.println("Cycle No. of Wheels: "+c.noOfWheels);
      System.out.println("Cycle Brand: "+c.Brand);
      System.out.println("Cycle Cost :"+c.Cost);
     
	} 
}
 