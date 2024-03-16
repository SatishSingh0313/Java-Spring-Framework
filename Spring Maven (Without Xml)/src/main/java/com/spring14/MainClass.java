package com.spring14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new  AnnotationConfigApplicationContext(PizzaConfiguration.class);
		
//		Pizza p = (Pizza) context.getBean("firstPizza");
		Pizza p = (Pizza) context.getBean("b");
		
		System.out.println("Pizza Type: "+p.getpName());
		System.out.println("Pizza Pprice: "+p.getpPrice());
		p.deliver();
	}
}
