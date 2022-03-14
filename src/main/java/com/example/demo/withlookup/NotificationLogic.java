package com.example.demo.withlookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.example.demo.withlookup.model.Notification;

@Service("withLookup")
public class NotificationLogic {

	@Lookup
	public Notification getCommunicatior(String arg) {
		return null;
	}

	public void sendNotification(final String type) {
		Notification communicator = getCommunicatior(type);
		communicator.message();
	}

}
