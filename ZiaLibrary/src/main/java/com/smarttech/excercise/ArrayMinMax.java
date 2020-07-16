package com.smarttech.excercise;

import java.util.Arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the min and max value
		int[] arr = {10,4,20,30,15,6,2,50,45};
		ArrayMinMax obj = new ArrayMinMax();
		obj.minMax(arr);
		obj.minMaxOld(arr);
		
	}	
	public void minMax(int[] arr) {
		System.out.println("******JAVA 8***********");
		int min=Arrays.stream(arr).min().getAsInt();
		int max=Arrays.stream(arr).max().getAsInt();
		
		int secondMax=Arrays.stream(arr).filter(i->i<max).max().getAsInt();
		int secondMin=Arrays.stream(arr).filter(i->i>min).min().getAsInt();
		
		System.out.println("Java 8::Max Value: "+max);	
		System.out.println("Java 8::Second Max: "+secondMax);
		System.out.println("Java 8::Min Value: "+min);
		System.out.println("Java 8::Second Min: "+secondMin);
		System.out.println();
	}
	public void minMaxOld(int[] arr) {
		System.out.println("******OLD JAVA**********");
		int highest=arr[0];
		int lowest=arr[0];
		int secondHighest=arr[0];
		int secondLowest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if(arr[i] > secondHighest) {
				secondHighest = arr[i];					
			}
			if(arr[i]<lowest) {
				secondLowest=lowest;
				lowest=arr[i];
			} else if(arr[i]<secondLowest) {
				secondLowest=arr[i];
			}
		}
		System.out.println("Highest: "+highest);
		System.out.println("Second Highest: "+secondHighest);
		System.out.println("Lowest: "+lowest);
		System.out.println("Second Lowest: "+secondLowest);
		System.out.println();
	}

}
