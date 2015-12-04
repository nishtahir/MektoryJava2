package com.nishtahir;

public class Generics {
	public Generics() {
		
		Wrapper<Integer> first = new Wrapper<>();
		first.setNumber(1);
		
		Wrapper<Integer> second = new Wrapper<>();
		second.setNumber(1);
		
		Wrapper<Integer> sum = new Wrapper<>();
		Integer value = first.getNumber()
				+ second.getNumber();
		sum.setNumber(value);
		
		Wrapper<Double> val = new Wrapper<>();
	}

	public static void main(String[] args) {
		new Generics();
	}
}
