package com.sp19;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
    private Certificate certi;
    
    	@Autowired
	public Student(Certificate certi) {
		
		this.certi = certi;
		System.out.println("Injecting the property using Constructor");
	}
	
	
	public Certificate getCerti() {
		return certi;
	}

	//@Autowired
	public void setCerti(Certificate certi) {
		this.certi = certi;
		System.out.println("Setting the property using Setter() ");
	}    
}
