package com.sp20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	@Qualifier("certi")
	@Autowired
    private Certificate certi;
   
	public Student(Certificate certi) {
		
		this.certi = certi;
		System.out.println("Injecting the property using Constructor");
	}
	
	//@Qualifier("certi")
	//@Autowired
      public void setCerti(Certificate certi) {
		this.certi = certi;
		System.out.println("Setting the property using Setter() ");
	}
      
	public Certificate getCerti() {
		return certi;
	}
}
