package com.sp18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceClass {
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("Autowiring.xml");
			
			Certificate c = context.getBean("certi", Certificate.class);
			
			System.out.println("Course Name: "+c.getcName());
			System.out.println("Course Duration: "+c.getcDuration()+" Months");
			
            System.out.println("----------------------------------------");
			
			Student s = context.getBean("stud1", Student.class);
			
			System.out.println("Course Name: "+s.getCerti().getcName());
			System.out.println("Course Duration: "+s.getCerti().getcDuration()+" Months");
			
			
		}
}
