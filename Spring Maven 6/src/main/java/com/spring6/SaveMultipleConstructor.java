package com.spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveMultipleConstructor {
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("Cons.xml");
			MultipleConstructor m=context.getBean("cons",MultipleConstructor.class);
			System.out.println(m);
			m.add();
			
	}
}
