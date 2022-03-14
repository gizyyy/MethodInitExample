package com.example.demo.withfactory.model;

import org.springframework.stereotype.Component;

@Component
public class Sms implements Notification{

	@Override
	public void message() {
		System.out.println("Sms has been sent");
	}
	
	Sms() {
		System.out.println("sms bean bean created");
	}
}
