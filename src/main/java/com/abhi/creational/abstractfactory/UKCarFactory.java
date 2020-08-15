package com.abhi.creational.abstractfactory;

class UKCarFactory {
	static Car buildCar(CarType model) {
		Car car = null;
		switch(model) {
			case MICRO: 
				car = new MicroCar(Location.UK);
				break;
			case MINI:
				car = new MiniCar(Location.UK);
				break;
			case LUXARY:
				car = new LuxaryCar(Location.UK);
				break;
		}
		return car;
	}
}