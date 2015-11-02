package com.example;

public class Vehicle {

	private String manufacturer;
	private int year;
	private String color;
	
	public Vehicle(String manufacturer, int year, String color) {
		super();
		this.manufacturer = manufacturer;
		this.year = year;
		this.color = color;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
