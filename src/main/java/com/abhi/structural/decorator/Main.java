package com.abhi.structural.decorator;

public class Main {

	public static void main(String[] args) {
		IceCream iceCream = new BasicIceCream();
		System.out.println("Creating basic ice-cream and cost is " + iceCream.cost());
		
		IceCream vanilla = new VanillaIceCream(iceCream);
		System.out.println("Creating vanilla ice-cream and cost is " + vanilla.cost());
		
		IceCream chcolateIceCream = new ChcolateIceCream(iceCream);
		System.out.println("Creating chcolate ice-cream and cost is " + chcolateIceCream.cost());

	}

}
