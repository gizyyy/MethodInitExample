package com.example.demo.withfactory.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class NotificationFactory {

	@Autowired
	private ApplicationContext applicationContext;

	public Notification getCommunicator(final String type) {
		if (type.equals("email")) {
			return applicationContext.getBean(Email.class);
		}

		if (type.equals("sms")) {
			return applicationContext.getBean(Sms.class);
		}

		if (type.equals("push")) {
			return applicationContext.getBean(PushMessage.class);
		}
		return applicationContext.getBean(Email.class);
	}

}
