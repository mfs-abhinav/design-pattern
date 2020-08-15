package com.abhi.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;
	
	public NewsChannel() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void addSubscriber(Observer obj) {
		this.observers.add(obj);
	}

	@Override
	public void removeSubscriber(Observer obj) {
		this.observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		if (!changed) {
			return;
		}
		
		for(Observer observer: observers) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	public void postMessage(String msg) {
		this.changed = true;
		this.message = msg;
		notifyObservers();
	}
	
}
