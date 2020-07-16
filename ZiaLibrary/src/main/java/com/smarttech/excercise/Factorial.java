package com.smarttech.excercise;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find a factorial of 4 ==> 4*3*2*1
		int number=4;
		int factor=1;
		for(int i=1;i<=4;i++) {
			factor = factor * i;
		}
		System.out.println(factor);		

	}

}
