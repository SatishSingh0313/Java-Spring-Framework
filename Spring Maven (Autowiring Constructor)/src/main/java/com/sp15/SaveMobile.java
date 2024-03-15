package com.sp15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveMobile {
    public static void main(String[] args) {
    	
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowire.xml");
		
		Mobile m = context.getBean("myMobile",Mobile.class);
		
		System.out.println("Brand: "+m.brand);
		
		System.out.println("Network: "+m.sim.network);
		
    }
}
