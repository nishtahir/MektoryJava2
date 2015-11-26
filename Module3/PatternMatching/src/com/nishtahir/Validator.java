package com.nishtahir;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	//Singleton
	public static Validator instance;
	private Pattern pattern;
	
	public static Validator getInstance() {
		if(instance == null){
			instance = new Validator();
		}
		
		return instance;
	}
	
	private Validator(){
		String myEmailPattern = "\\w+@\\w+\\.\\w+"; // !$##%*)(*$
		pattern = Pattern.compile(myEmailPattern);
	}
	
	public boolean validateEmail(String userInput) {
		Matcher matcher = pattern.matcher(userInput);
		return matcher.matches();
	}

}
