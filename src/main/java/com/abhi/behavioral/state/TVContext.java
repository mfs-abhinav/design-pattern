package com.abhi.behavioral.state;

public class TVContext implements State {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State tvState) {
        this.state = tvState;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
