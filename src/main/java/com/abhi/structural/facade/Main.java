package com.abhi.structural.facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade(new CPU(), new RAM(), new HardDrive());
        computerFacade.startComputer();
    }
}
