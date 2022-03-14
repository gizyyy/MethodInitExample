package com.example.demo.withlookup.model;

public class Notification {
	
	// letting more types, can be anything
	private String type;

	public void message() {
		System.out.println(this.type + " message has been sent");
	}
	
	public Notification(String type){
		this.type = type;
		System.out.println(type + " Notification bean created");
	}
	
	public Notification(){
		System.out.println("Notification bean created");
	}
}
