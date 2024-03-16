package com.spring13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
   public static void main(String[] args) {
	   
	ApplicationContext context = new ClassPathXmlApplicationContext("Expression.xml");
	
	Ipl i= (Ipl) context.getBean("ipl");
	
	System.out.println("TeamName: "+i.getTeamName());
	System.out.println("TeamCaptain: "+i.getCaptainName());
	System.out.println("TeamPlayers: "+i.getPlayers());
	System.out.println("Add to Value: "+i.getX());
	System.out.println("Use Ternary Operator: "+i.getY());
	System.out.println("Use Ternary Operator With HexaDecimal: "+i.getZ());
	System.out.println("Use Math Class Variable: "+i.getPower());
	System.out.println("Use Math Class Static Variable: "+i.getStaticVariale());
	System.out.println("Use Boolean Value: "+i.getI());
	System.out.println("String Type Value: "+i.getStringTypeObjectValue());
	
	System.out.println("----------------------------------");
	
	System.out.println("---Use Prototype And Singleton---");
	
	Ipl a1= (Ipl) context.getBean("ipl");
	
	System.out.println(a1.hashCode());
	
	Ipl a2= (Ipl) context.getBean("ipl");
	
	System.out.println(a2.hashCode());
}
}
