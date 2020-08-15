package com.abhi.creational.abstractfactory;

class CarFactory {
	public static Car buildCar(CarType model) {
		Car car = null;
		Location location = Location.INDIA;
		switch(location) {
			case INDIA: 
				car = IndiaCarFactory.buildCar(model);
				break;
			case UK:
				car = UKCarFactory.buildCar(model);
				break;
			case USA:
				car = USACarFactory.buildCar(model);
				break;
		}
		return car;
	}
}