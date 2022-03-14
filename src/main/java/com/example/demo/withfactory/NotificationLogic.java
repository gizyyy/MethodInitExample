package com.example.demo.withfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.withfactory.model.Notification;
import com.example.demo.withfactory.model.NotificationFactory;

@Service("withFactory")

public class NotificationLogic {

	@Autowired
	private NotificationFactory notificationFactory;

	public void sendNotification(final String communicatorType) {
		Notification communicator = notificationFactory.getCommunicator(communicatorType);
		communicator.message();
	}

}
