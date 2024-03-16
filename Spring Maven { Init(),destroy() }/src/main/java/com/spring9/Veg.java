package com.spring9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Veg {
	
		private int cost;
		
		public void setCost(int cost) {
			this.cost=cost;
		}
		
		public int getCost() {
			return cost;
		}
		
		@PostConstruct  // @PostConstruct Like  [ init() method ]
		public void start() {
			System.out.println("Started Like Init");
		}
		@PreDestroy    // @PreDestroy Like [ destroy() method ]
		public void stop() {
			System.out.println("Stop Like destroy");
		}
}
