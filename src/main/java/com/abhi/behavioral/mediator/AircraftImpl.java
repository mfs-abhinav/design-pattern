package com.abhi.behavioral.mediator;

public class AircraftImpl extends Aircraft {

    public AircraftImpl(ATCMediator atcMediator, String name) {
        super(atcMediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sending message = " + msg);
        atcMediator.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received message = " + msg);
    }
}
