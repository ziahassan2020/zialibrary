package com.smarttech.excercise;

public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		System.out.println("Before Swap a= "+a+" b= "+b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After Swap a= "+a+" b= "+b);

	}

}
