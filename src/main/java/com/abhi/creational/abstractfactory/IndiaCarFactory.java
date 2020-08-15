package com.abhi.creational.abstractfactory;

class IndiaCarFactory {
	static Car buildCar(CarType model) {
		Car car = null;
		switch(model) {
			case MICRO: 
				car = new MicroCar(Location.INDIA);
				break;
			case MINI:
				car = new MiniCar(Location.INDIA);
				break;
			case LUXARY:
				car = new LuxaryCar(Location.INDIA);
				break;
		}
		return car;
	}
}