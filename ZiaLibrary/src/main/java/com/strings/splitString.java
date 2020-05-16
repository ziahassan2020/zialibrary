package com.strings;

import java.util.Arrays;

public class splitString {

	public static void main(String[] args) {
		String country = new String("United State Of America");
		System.out.println(Arrays.toString(country.split(" ")));  
		System.out.println("*****************");
		
		String[] pieces =  country.split(" ");				
		for (int i=0; i<pieces.length;i++) {
			System.out.println(pieces[i]);
		}	
		System.out.println("*****************");
		for (String name:pieces) {
			System.out.println(name);
		}		

	}

}
