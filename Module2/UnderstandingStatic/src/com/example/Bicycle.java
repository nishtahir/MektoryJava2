package com.example;

public class Bicycle extends Vehicle{
	
	private String bell;
	
	public Bicycle(String manufacturer, int year, String color) {
		super(manufacturer, year, color);
	}

	public Bicycle(String manufacturer, int year, String color, String bell) {
		super(manufacturer, year, color);
		this.bell = bell;
	}

	public String getBell() {
		return bell;
	}

	public void setBell(String bell) {
		this.bell = bell;
	}
}
