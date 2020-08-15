package com.abhi.structural.facade;

public class ComputerFacade {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu, RAM ram, HardDrive hardDrive) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        this.cpu.start();
        this.ram.initializeRAM();
        this.hardDrive.setUpHardDrive();
    }
}
