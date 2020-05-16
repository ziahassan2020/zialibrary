package com.collections;

import java.util.Arrays;

public class simpleArray {

	public static void main(String[] args) {
		//Declare array in new way
		int[] a= {10,20,30};	// Single dimension
		int[][] b= {{10,20,30},{40,50,60}}; 	//two/Multi dimension 
		String[] name = {"ZIA","HASSAN","HELLO WORLD"};
		
		//Old Way to declare an array		
		int[] a1 = new int[3];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		// Print Array
		
		
		int[] newArray = {66,55,44,33,88,22,11};
		System.out.println(Arrays.toString(newArray));
		//Basic for loop		
		for(int i=0;i<newArray.length;i++) {
	//		System.out.println(newArray[i]);
		}
		//Advance/enhance for loop		
		for(int i:newArray) {
	//		System.out.println(i);
		}
			

	}

}
