package com.abhi.creational.abstractfactory;

class LuxaryCar extends Car {

	public LuxaryCar(Location location) {
		super(CarType.LUXARY, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Constructing luxary car");
	}
	
}