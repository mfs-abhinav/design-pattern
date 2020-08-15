package com.abhi.creational.factory;

public class EmailNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("Send Email notification....");
	}

}
