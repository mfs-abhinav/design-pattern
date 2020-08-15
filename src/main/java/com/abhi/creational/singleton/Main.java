package com.abhi.creational.singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("1st object " + Singleton.getInstance());
		System.out.println("2nd object " + Singleton.getInstance());
	}

}

class Singleton {
	
//	 private static Singleton singletonInstance;
	 private volatile static Singleton singletonInstance;
	
//	private static Singleton singletonInstance = new Singleton(); //eager loading
	
	private Singleton() {}
	
//	public static Singleton getInstance() {
//		return singletonInstance;
//	}
	
//	public synchronized static Singleton getInstance() {
//		if (singletonInstance == null) {
//			singletonInstance = new Singleton();
//		}
//		return singletonInstance;
//	}
	
//	public static Singleton getInstance() {
//		if (singletonInstance == null) {
//			singletonInstance = new Singleton();
//		}
//		return singletonInstance;
//	}
	
	public static Singleton getInstance() {
		if (singletonInstance == null) {
			synchronized (Singleton.class) {
				if (singletonInstance == null) {
					singletonInstance = new Singleton();
				}
			}
		}
		return singletonInstance;
	}
}
