package com.abhi.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ATCMediator atcMediator = new ATCMediatorImpl();

        Aircraft airIndia = new AircraftImpl(atcMediator, "Air India");
        Aircraft indigo = new AircraftImpl(atcMediator, "Indigo");
        Aircraft spiceJet = new AircraftImpl(atcMediator, "Spice Jet");

        atcMediator.add(airIndia);
        atcMediator.add(indigo);
        atcMediator.add(spiceJet);

        airIndia.send("Hello from Air India....");
    }
}
