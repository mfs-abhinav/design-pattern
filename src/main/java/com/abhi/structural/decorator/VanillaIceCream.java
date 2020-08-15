package com.abhi.structural.decorator;

public class VanillaIceCream extends IceCreamDecorator {

	public VanillaIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		return super.cost() + 20;
	}

}
