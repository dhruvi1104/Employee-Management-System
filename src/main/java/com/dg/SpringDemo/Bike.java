package com.dg.SpringDemo;

import org.springframework.stereotype.Component;

@Component //for annotation based configuration
public class Bike implements Vehicle{

	public void drive() {

		System.out.println("Bike is working");
		
	}

}
