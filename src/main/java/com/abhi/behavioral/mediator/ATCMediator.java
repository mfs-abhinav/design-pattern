package com.abhi.behavioral.mediator;

public interface ATCMediator {
    void add(Aircraft aircraft);
    void send(String msg, Aircraft aircraft);
}
