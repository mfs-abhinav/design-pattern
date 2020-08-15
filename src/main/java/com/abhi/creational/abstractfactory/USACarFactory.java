package com.abhi.creational.abstractfactory;

class USACarFactory {
	static Car buildCar(CarType model) {
		Car car = null;
		switch(model) {
			case MICRO: 
				car = new MicroCar(Location.USA);
				break;
			case MINI:
				car = new MiniCar(Location.USA);
				break;
			case LUXARY:
				car = new LuxaryCar(Location.USA);
				break;
		}
		return car;
	}
}