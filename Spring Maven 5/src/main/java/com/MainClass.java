package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	 public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
			
			Vehicle	v=(Vehicle)	context.getBean("myVehicle");
			
			System.out.println("VehicleColor:-"+v.getColor());
			
			System.out.println("--------------------------");
			
			Car	c=(Car)	context.getBean("myCar");
			
			System.out.println("Car Brand:-"+c.getBrand());
			System.out.println("Car Color:-"+c.getColor());

     }
}