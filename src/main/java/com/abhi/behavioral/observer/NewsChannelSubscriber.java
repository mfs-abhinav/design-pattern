package com.abhi.behavioral.observer;

public class NewsChannelSubscriber implements Observer {
	
	private String name;
	private Subject channel;
	
	public NewsChannelSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String) channel.getUpdate(this);
		if (msg == null) {
			System.out.println("There is no message");
		} else {
			System.out.println(this.name + " retreving message " + msg);
		}
	}

	@Override
	public void setSubject(Subject sub) {
		this.channel = sub;
	}

}
