package com.hexaware.demo;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements IMessageService {

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub

		System.out.println(message);
	}

}
