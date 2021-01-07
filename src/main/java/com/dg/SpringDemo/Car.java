package com.dg.SpringDemo;

import org.springframework.stereotype.Component;

@Component //for annotation based configuration
public class Car implements Vehicle{

	public void drive() {
		
		System.out.println("Car is working");
		
	}

	
}
