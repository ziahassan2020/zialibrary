package com.smarttech.excercise;

import java.util.Scanner;

public class SwapValuesUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a First value");
		int a = input.nextInt();
		System.out.print("Please enter a Second value");
		int b = input.nextInt();
		System.out.println("Input Values are= "+a+" , "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap= "+a +" , "+b);

	}

}
