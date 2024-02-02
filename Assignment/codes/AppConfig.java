package com.hexaware.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public IVehicle returnCarObj()
	{
		return new Car();
	}
	@Bean
	public IVehicle returnBikeObj()
	{
		return new Bike();
	}
	@Bean
	public IVehicle returnCycleObj()
	{
		return new Cycle();
	}
	@Bean
	public Traveller returnTravellerObj()
	{
		return new Traveller(returnCycleObj());//Dependency Injection
	}

}
