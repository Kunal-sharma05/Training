package com.hexaware.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveller")
public class Traveller {

	IVehicle obj=null;
	@Autowired
	public Traveller(@Qualifier("car")IVehicle t)// we can also use @Primary qualifier at the place of component class only;
	{
		this.obj=t;
	}
	public void startJourney()
	{
		this.obj.move();
	}
}
