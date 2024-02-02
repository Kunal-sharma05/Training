package com.hexaware.demo;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements IVehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub

		System.out.println("Car is moving");
	}

}
