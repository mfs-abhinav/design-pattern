package com.abhi.structural.decorator;

public class ChcolateIceCream extends IceCreamDecorator {

	public ChcolateIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		return super.cost() + 30;
	}
	
	

}
