package com.example.demo.withfactory.model;

import org.springframework.stereotype.Component;

@Component
public class Email implements Notification{

	@Override
	public void message() {
		System.out.println("Email has been sent");
	}
	
	Email() {
		System.out.println("email bean created");
	}

}
