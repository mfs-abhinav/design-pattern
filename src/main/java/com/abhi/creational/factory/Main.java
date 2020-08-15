package com.abhi.creational.factory;

/*All the wrapper classes like Integer, Boolean etc, 
in Java uses factory pattern to evaluate the values using valueOf() method*/

public class Main {

	public static void main(String[] args) {
		Notification sms = NotificationFactory.createNotification("sms");
		sms.sendNotification();
		
		Notification email = NotificationFactory.createNotification("email");
		email.sendNotification();
	}

}
