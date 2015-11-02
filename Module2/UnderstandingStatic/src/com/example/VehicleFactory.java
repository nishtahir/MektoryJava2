package com.example;

// Static utility class
public class VehicleFactory {
	
	private VehicleFactory(){
		
	}
	
	public static Vehicle newVehicle(){
		return new Vehicle("Nish Industries", 2015, "Hotrod red");
	}
	
	public static Vehicle newVehicle(String manufacturer){
		return new Vehicle(manufacturer, 2015, "Hotrod red");
	}
	
	public static Vehicle newBicycle(){
		return new Bicycle("Mountain bike", 1990, "Metal", "It rings");
	}
}
