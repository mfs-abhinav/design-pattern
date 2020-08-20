package com.abhi.behavioral.mediator;

public abstract class Aircraft {
    protected ATCMediator atcMediator;
    protected String name;

    public Aircraft(ATCMediator atcMediator, String name) {
        this.atcMediator = atcMediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
