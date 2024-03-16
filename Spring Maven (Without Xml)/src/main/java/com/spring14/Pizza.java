package com.spring14;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("firstPizza")
public class Pizza {
	
	@Value("Cheese And Corn")
    private String pName;
	
	@Value("199.99")
    private double pPrice;
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	
	void deliver() {
		System.out.println("Deliver My Pizza I am Very Hungry");
	}
}
