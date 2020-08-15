package com.abhi.creational.abstractfactory;

public class Main {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.MICRO)); 
        System.out.println(CarFactory.buildCar(CarType.MINI)); 
        System.out.println(CarFactory.buildCar(CarType.LUXARY)); 
	}
}

enum CarType {
	MICRO, MINI, LUXARY
}

enum Location {
	USA, INDIA, UK
}