package com.spring15;

import org.springframework.stereotype.Component;

@Component
public class Pizza {
	private Pepsi pepsi;
	
	public Pizza(Pepsi pepsi) {
		this.pepsi=pepsi;
	}
	
	void deliver() {
		pepsi.drink();
    	System.out.println("Deliver My Pizza");
    }
	
    public Pepsi getPepsi() {
		return pepsi;
	}

	public void setPepsi(Pepsi pepsi) {
		this.pepsi = pepsi;
	}
	

}
