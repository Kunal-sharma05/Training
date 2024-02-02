package com.hexaware.demo;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService {

	IDataSource obj1=null;
	IDataSource obj2=null;
	@Autowired
	public EmailService(IDataSource t)// we can also use @Primary qualifier at the place of component class only;
	{
		this.obj1=t;
		System.out.println("constructor inject Bean : " +this.obj1);	
	}
	public void sendEmail()
	{
		obj1.returnConnection();
	}
}
