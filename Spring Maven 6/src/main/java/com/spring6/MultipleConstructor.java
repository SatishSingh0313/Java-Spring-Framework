package com.spring6;

public class MultipleConstructor {
	private int x;
	private int y;
	
	public MultipleConstructor(double x , double y) {
		this.x=(int) x;
		this.y=(int) y;
		
	System.out.println("constructor (double)");
	}
	
	public MultipleConstructor(int x , int y) {
		this.x= x;
		this.y= y;
	System.out.println("constructor (int)");
	}
	public MultipleConstructor(String x , String y) {
		this.x= Integer.parseInt(x);
		this.y= Integer.parseInt(y);
	System.out.println("constructor (String)");
	}
	
	
	public void add() {
		System.out.println("X: "+x +" Y: "+y);
	}
	
	@Override
	public String toString() {
		return "MultipleConstructor [x=" + x + ", y=" + y + "]";
	}	
}
