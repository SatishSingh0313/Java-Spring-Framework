package com.spring9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveVeg {
		public static void main(String[] args) {
			
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("Veg.xml");
			Veg  v = context.getBean("veg",Veg.class);
			
			System.out.println(v.getCost());
			
			context.registerShutdownHook(); //called destroy method
			
			
		}
}
