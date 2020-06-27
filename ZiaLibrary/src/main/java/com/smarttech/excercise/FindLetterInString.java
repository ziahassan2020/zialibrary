package com.smarttech.excercise;

import java.util.Map;
import java.util.stream.Collectors;

public class FindLetterInString {

	public static void main(String[] args) {
		//Find letter E
		String country = "UNITED STATES OF AMERICA";
		for(int i=0; i<country.length();i++) {
			if(country.charAt(i)=='E') {
				System.out.println(country.charAt(i)+ " at position: "+i);
			}
					
		}
		System.out.println("******* JAVA 8 **********");
		System.out.println("Find chracters in the string");
		Map<String, Long> a = country.chars().mapToObj(i->(char)i)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));		
		System.out.println(a);
	}

}
