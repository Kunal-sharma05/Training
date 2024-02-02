package com.hexaware.demo;
import org.springframework.stereotype.Component;

@Component("cycle")
public class Cycle implements IVehicle {

		public void move()
		{
			System.out.println("Cycle is moving");
		}

	}


