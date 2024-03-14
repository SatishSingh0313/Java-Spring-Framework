package com.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("AddressList.xml");
			
			Address a =(Address) context.getBean("myAddress");
			
			System.out.println("List Elements : "+a.getAddressList());
			System.out.println("List Elements : "+a.getAddressList().get(1));
			
	}
}
