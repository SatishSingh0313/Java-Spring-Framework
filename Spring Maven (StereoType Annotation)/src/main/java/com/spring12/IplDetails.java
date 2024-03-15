package com.spring12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IplDetails {
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("StereoTypeAnnotation.xml");
			
		    Ipl i = context.getBean("ipl", Ipl.class);
		    System.out.println(i);
		}
}