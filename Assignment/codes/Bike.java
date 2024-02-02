package com.hexaware.demo;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements IVehicle {
	public void move()
	{
		System.out.println("Bike is moving");
	}

}
