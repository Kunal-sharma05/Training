package com.hexaware.demo;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements IMessageService {
	public void sendMessage(String message)
	{
		System.out.println(message);
	}

}
