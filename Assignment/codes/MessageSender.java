package com.hexaware.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("messageSender")
public class MessageSender {

	IMessageService obj1=null;
	IMessageService obj2=null;
	@Autowired
	public void setObj1(@Qualifier("smsService")IMessageService obj1) {
		System.out.println("Setter based DI of sms");
		this.obj1 = obj1;
	}
	@Autowired
	public void setObj2(@Qualifier("emailService")IMessageService obj2) {
		System.out.println("Setter based DI of email");
		this.obj2 = obj2;
	}
	public void send(String message, String medium)
	{
		if(medium.equalsIgnoreCase("sms"))
		{
			obj1.sendMessage(message);
		}
		else
		{
			obj2.sendMessage(message);
		}
	}
}
