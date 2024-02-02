package com.hexaware.demo;

import org.springframework.stereotype.Component;

@Component("postgesSQLDatabase")
public class PostgesSQLDataSource implements IDataSource {
	public void returnConnection()
	{
		System.out.println("PostgesSQLConnection is called ....");
	}

}
