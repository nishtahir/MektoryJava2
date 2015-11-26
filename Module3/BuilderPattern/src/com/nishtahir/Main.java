package com.nishtahir;

public class Main {

	public static void main(String[] args) {
		Address address = new Address.Builder()
			.city("Tallinn")
			.county("Estonia")
			.appartmentNumber(4)
			.streetName("Raja")
			.create();
		
	}

}
