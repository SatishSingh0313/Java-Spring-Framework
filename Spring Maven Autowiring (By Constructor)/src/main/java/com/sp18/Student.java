package com.sp18;

public class Student {
	
    private Certificate certi;
    
	public Student(Certificate certi) {
		
		this.certi = certi;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
}
