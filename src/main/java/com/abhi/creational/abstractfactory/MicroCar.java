package com.abhi.creational.abstractfactory;

class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Constructing micro car");
	}
	
}