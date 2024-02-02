package com.hexaware.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * IDataSource t=new Car(); MessageSender obj = new MessageSender(t); obj.startJourney();
		 */
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailService obj =(EmailService) applicationContext.getBean("emailService");
		obj.sendEmail();
		
		//@component in class level
		//@ComponentScan---> packages to scan
		//use @ AutoWired injet the bean
		//@Qualifier annotation --- to avoid the confusion between muktiple beans of same type
		//Create IOC container- 
	}

}
