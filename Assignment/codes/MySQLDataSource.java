package com.hexaware.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mySQL")
@Primary
public class MySQLDataSource implements IDataSource {

	@Override
	public void returnConnection() {
		// TODO Auto-generated method stub

		System.out.println("MySQLDataSource database is called ..");
	}

}
