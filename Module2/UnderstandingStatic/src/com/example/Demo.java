package com.example;

public class Demo {

	// JIT - Just in time
	// Created when loaded
	public static void main(String[] args) {
		add();
		MathUtils.add(5, 9);
		MathObject o1 = new MathObject();
		MathObject o2 = new MathObject();
		MathObject o3 = new MathObject();

		o1.doSomething();
		o2.doSomething();
		o3.doSomething();
		
		MathUtils.addToNumber(7);
		
		Vehicle v = new Vehicle("man", 123, "blue");
		Vehicle v1 = VehicleFactory.newVehicle();
		
		Bicycle b = (Bicycle) VehicleFactory.newBicycle();
		
		Vehicle b2 = VehicleFactory.newBicycle();
		Bicycle myBike = (Bicycle) b2;
		System.out.println();
	}

	public static void add() {

	}

}
