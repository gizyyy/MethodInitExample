package com.example.demo.withlookup.model;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class NotificationConfiguration {
	
	@Bean(name = "notification")
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public Notification notification(final String arg) {
		return new Notification(arg);
	}
	
}
