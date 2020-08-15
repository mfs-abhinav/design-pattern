package com.abhi.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		NewsChannel ani = new NewsChannel();
		
		Observer obj1 = new NewsChannelSubscriber("obj1");
		Observer obj2 = new NewsChannelSubscriber("obj2");
		
		ani.addSubscriber(obj1);
		ani.addSubscriber(obj2);
		
		obj1.setSubject(ani);
		obj2.setSubject(ani);
		
		ani.postMessage("This message is coming from observer design pattern");

	}

}
