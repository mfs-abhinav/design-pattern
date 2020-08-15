package com.abhi.behavioral.observer;

public interface Subject {
	public void addSubscriber(Observer obj);
	public void removeSubscriber(Observer obj);
	public void notifyObservers();
	public Object getUpdate(Observer obj);
}
