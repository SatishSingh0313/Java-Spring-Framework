package com.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveAddress {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Address.xml");
		
		Address a = context.getBean("myAddress", Address.class);
		
		System.out.println(a.getAddress());
		
		System.out.println("------------------------");
		
		Address a1 = context.getBean("myprop", Address.class);
		System.out.println(a1.getAddressprops());
	
	}
}
                    