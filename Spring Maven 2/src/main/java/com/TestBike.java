package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBike {
		public static void main(String[] args) {
//			
//				ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//				
//				Bike t = (Bike) context.getBean("myBike");
			
			
			Resource r = new ClassPathResource("bean.xml");
			BeanFactory f = new XmlBeanFactory(r);
			Bike t = (Bike) f.getBean("myBike");
			
			
//			XmlBeanFactory f = new XmlBeanFactory(new ClassPathResource("bean.xml"));
//			Bike t = (Bike) f.getBean("myBike");
			
				
				System.out.println("Id   : "+t.getId());
				System.out.println("Brand: "+t.getBrand());
				System.out.println("Color: "+t.getColor());
				System.out.println("Price: "+t.getPrice());
				
		}	
}
