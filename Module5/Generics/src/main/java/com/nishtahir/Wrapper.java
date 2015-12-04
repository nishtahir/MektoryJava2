package com.nishtahir;

public class Wrapper<T extends Number & Comparable<T>> {
	
	private T number;

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}
	
}
