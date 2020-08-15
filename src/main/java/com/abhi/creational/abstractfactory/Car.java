package com.abhi.creational.abstractfactory;

abstract class Car {
	private CarType model;
	private Location location;
	
	public Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}
	
	public abstract void construct();

	public CarType getCarType() {
		return model;
	}

	public void setCarType(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}
}