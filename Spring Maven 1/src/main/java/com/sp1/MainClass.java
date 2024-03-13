package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
 public static void main(String[] args) {
	 
	 ApplicationContext context =new ClassPathXmlApplicationContext("studentbean.xml");
		
	    Student h =(Student) context.getBean("stu");
	    
		System.out.println("Student Id: "+h.getId());
		System.out.println("Student Name: "+h.getName());
		System.out.println("Student Email: "+h.getEmailId());
		
 	}
}
