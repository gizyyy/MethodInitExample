package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.withfactory.NotificationLogic;
import com.example.demo.withfactory.model.NotificationFactory;

@SpringBootTest
class MethodInitExampleApplicationTests {

	@Autowired
	@Qualifier("withFactory")
	private NotificationLogic withFactory;

	@Autowired
	private NotificationFactory notificationFactory;

	@Autowired
	@Qualifier("withLookup")
	private com.example.demo.withlookup.NotificationLogic withLookup;

	@Test
	public void testWithFactory() {
		withFactory.sendNotification("email");
		withFactory.sendNotification("sms");
		withFactory.sendNotification("push");
		withFactory.sendNotification("email");
		withFactory.sendNotification("push");
		assertEquals(1, 1);
	}

	@Test
	public void testWithLookup() {
		withLookup.sendNotification("webpage");
		withLookup.sendNotification("location");
		withLookup.sendNotification("applewatch");
		assertEquals(1, 1);
	}

}
