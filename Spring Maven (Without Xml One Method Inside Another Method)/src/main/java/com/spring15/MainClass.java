package com.spring15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
  public static void main(String[] args) {
	  
	ApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
	
	Pizza p = (Pizza) context.getBean("a");
	p.deliver();
	
	System.out.println("-------------");
	
	Pepsi p1 = (Pepsi) context.getBean("d");
	p1.drink();
	
    } 
 }
