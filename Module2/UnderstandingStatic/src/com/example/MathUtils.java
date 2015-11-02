package com.example;

public class MathUtils {
	public static final int UNIVERSAL_CONSTANT = 42;
	public static int utilNumber = 0;
	
	public static int add(int x, int y){
		return x + y;
	}
	
	public static int addToNumber(int x){
		int result = (utilNumber = utilNumber + x);
		return result;
	}
	
}
