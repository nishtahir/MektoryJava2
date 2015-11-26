package com.nishtahir;

public class Main {
	public static void main(String[] args) {
		
		String input = "nishtahir@outlook.com";
		if(Validator.getInstance().validateEmail(input)){
			System.out.println("Valid email");
		} else {
			System.out.println("Invalid email");
		}
		
	}
}
