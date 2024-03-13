package com;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {
 public static void main(String[] args) {
	 
		XmlBeanFactory f = new XmlBeanFactory(new ClassPathResource("bean.txt"));
		
		Course t =(Course) f.getBean("course");
		
		System.out.println("Course Id: "+t.getCourseId());
		System.out.println("Course Name: "+t.getCourseName());
		System.out.println("Course Marks: "+ t.getCourseMarks());
		
 	    }
}
