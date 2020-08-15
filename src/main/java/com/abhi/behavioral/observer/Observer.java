package com.abhi.behavioral.observer;

import com.abhi.behavioral.observer.Subject;

public interface Observer {
	public void update();
	public void setSubject(Subject sub);
}
