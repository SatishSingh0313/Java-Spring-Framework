
package com.spring11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDetails {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("StandAloneCollection.xml");
		
		Emp e = context.getBean("emp1",Emp.class);
		
		System.out.println(e.getVehicle());
		System.out.println(e.getVehicle().getClass().getName());
		
		System.out.println("----------------------------------------------");
		
		System.out.println(e.getEmail());
		System.out.println(e.getEmail().getClass().getName());
		
		System.out.println("----------------------------------------------");
		
		System.out.println(e.getName());
		System.out.println(e.getName().getClass().getName());
		
		System.out.println("----------------------------------------------");
		
		System.out.println(e.getDbprop());
		System.out.println(e.getDbprop().getClass().getName());
		
		System.out.println("----------------------------------------------");
		
		// Reused the code
		
		Emp e1 = context.getBean("emp2",Emp.class);
		
		System.out.println(e1.getVehicle());
		System.out.println(e1.getVehicle().getClass().getName());
	}
}
