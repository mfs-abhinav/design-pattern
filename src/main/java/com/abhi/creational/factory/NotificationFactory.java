package com.abhi.creational.factory;

public class NotificationFactory {
	
	private NotificationFactory() {
		// throw new RuntimeException("Object creation is not allowed");
		throw new IllegalStateException("NotificationFactory class");
	}
	
	public static Notification createNotification(String channel) {
		if (channel == null ||channel.isEmpty()) {
			return null;
		} else if(channel == "sms") {
			return new SMSNotification();
		} else if(channel == "email") {
			return new EmailNotification();
		}
		return null;
	}

}
