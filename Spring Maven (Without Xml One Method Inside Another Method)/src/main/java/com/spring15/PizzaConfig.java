package com.spring15;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {
	
     @Bean(name= {"d"})
	public Pepsi getPepsi() {
		Pepsi p1 = new Pepsi();
		return p1;
	}
     
	@Bean(name={"a","b","c"})
	 public Pizza getPizza() {
		 Pizza p =new Pizza(getPepsi());
		 return p;
	 }
}
