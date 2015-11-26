package com.nishtahir;

public class Address {

	private int appartmentNumber;
	private String streetName;
	private String county;
	private String city;
	private String country;
	private String planet;

	public Address(int appartmentNumber, String streetName, String county, String city, String country, String planet) {
		super();
		this.appartmentNumber = appartmentNumber;
		this.streetName = streetName;
		this.county = county;
		this.city = city;
		this.country = country;
		this.planet = planet;
	}

	public int getAppartmentNumber() {
		return appartmentNumber;
	}

	public void setAppartmentNumber(int appartmentNumber) {
		this.appartmentNumber = appartmentNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}
	
	
	
	public static class Builder {
		private int appartmentNumber;
		private String streetName;
		private String county;
		private String city;
		private String country;
		private String planet;
		
		public Builder appartmentNumber(int appartmentNumber){
			this.appartmentNumber = appartmentNumber;
			return this;
		}
		
		public Builder streetName(String streetName){
			this.streetName = streetName;
			return this;
		}
		
		public Builder county(String county){
			this.county = county;
			return this;
		}
		public Builder city(String city){
			this.city = city;
			return this;
		}
		
		public Address create(){
			return 	new  Address(appartmentNumber, streetName, county, city, country, planet);
		}
	}
}
