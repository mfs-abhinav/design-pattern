package com.abhi.creational.factory;

public class SamsungFactory extends MobileFactory {
    @Override
    public Mobile createMobile() {
        System.out.println("Creating samsung mobile");
        return new Samsung();
    }
}
