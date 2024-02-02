package com.hexaware.demo;

public class Traveller {

	IVehicle obj=null;
	public Traveller(IVehicle t)
	{
		this.obj=t;
	}
	public void startJourney()
	{
		this.obj.move();
	}
}
