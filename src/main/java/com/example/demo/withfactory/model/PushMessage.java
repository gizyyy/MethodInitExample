package com.example.demo.withfactory.model;

import org.springframework.stereotype.Component;

@Component
public class PushMessage implements Notification{

	@Override
	public void message() {
		System.out.println("Push has been sent");
	}
	
	PushMessage() {
		System.out.println("push message bean bean created");
	}
}
