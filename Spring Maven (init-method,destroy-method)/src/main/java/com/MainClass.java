package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Mobile m1 = (Mobile) context.getBean("color");
		Mobile m2 = (Mobile) context.getBean("sim");
		
	}
}