package com.sorts;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,5, 200, 40,50,60};
		
		
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println("First Position: "+a[0]);
		System.out.println("Last Position: "+a[a.length-1]);		
		System.out.println(Arrays.toString(a));
		System.out.println("Max Number: "+Arrays.stream(a).max().getAsInt());
		System.out.println("Min Number: "+Arrays.stream(a).min().getAsInt());
		Arrays.sort(a);
		System.out.println("Sorted Array: "+Arrays.toString(a));
	}

}
