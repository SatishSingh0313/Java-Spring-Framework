package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveAddress {
	
   public static void main(String[] args) {
	   
			ApplicationContext context = new ClassPathXmlApplicationContext("AddressSet.xml");
			
			Address a =(Address) context.getBean("myAddress");
			
			System.out.println("Set Elements : "+a.getAddressSet()); //duplicate is not allowed in set
			
			System.out.println("---------------------");
			
			for(Object i:a.getAddressSet()) {
				System.out.println(i);
			}
		
}
}
