package com.abhi.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {
    private List<Aircraft> aircraftList;

    public ATCMediatorImpl() {
        this.aircraftList = new ArrayList<>();
    }

    @Override
    public void add(Aircraft aircraft) {
        this.aircraftList.add(aircraft);
    }

    @Override
    public void send(String msg, Aircraft aircraft) {
        for (Aircraft a: this.aircraftList) {
            if ( a != aircraft) {
                a.receive(msg);
            }
        }
    }
}
