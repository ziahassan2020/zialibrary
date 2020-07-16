package com.smarttech.excercise;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "MOM";
		StringBuilder strBldr = new StringBuilder(name).reverse();
		if(name.equalsIgnoreCase(strBldr.toString())) {
			System.out.println("It is Pallindrome");
		} else {
			System.out.println("It is not Palindrome");
		}

	}

}
