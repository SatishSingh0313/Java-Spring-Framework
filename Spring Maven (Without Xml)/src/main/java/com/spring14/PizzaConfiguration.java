package com.spring14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.spring14")
public class PizzaConfiguration {
	
        @Bean(name={"a","b","c"})
	     public Pizza getPizza() {
		  Pizza p = new Pizza();
		  return p;
	  }
}
