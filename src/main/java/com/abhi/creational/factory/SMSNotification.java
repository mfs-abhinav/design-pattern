package com.abhi.creational.factory;

public class SMSNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("Send SMS notification....");
	}

}
