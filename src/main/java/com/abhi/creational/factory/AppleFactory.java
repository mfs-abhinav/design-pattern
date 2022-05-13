package com.abhi.creational.factory;

public class AppleFactory extends MobileFactory{
    @Override
    public Mobile createMobile() {
        System.out.println("Creating apple mobile");
        return new Apple();
    }
}
