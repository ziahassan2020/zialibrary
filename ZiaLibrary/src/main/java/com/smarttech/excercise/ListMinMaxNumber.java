package com.smarttech.excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find a min and mx number from 10,20,30,40 list
		
		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(20);
		myList.add(40);
		myList.add(30);
	//	myList.remove(0);
	//	myList.remove(new Integer(10));  // Remove by object
		ListMinMaxNumber obj = new ListMinMaxNumber();
		obj.getMinMaxValue(myList);
		obj.getMinMaxByStream(myList);
	}
	public void getMinMaxValue(List<Integer> inList) {
		System.out.println("Min Num: "+Collections.min(inList));
		System.out.println("Max Num: "+Collections.max(inList));
	}
	
	public void getMinMaxByStream(List<Integer> inList) {
		System.out.println("******By Stream Java 8*******");
		int maxValue=inList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int minValue=inList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Stream Max: "+maxValue);
		System.out.println("Stream Min: "+minValue);
		System.out.println("*****Second Max******");
		inList.remove(new Integer(maxValue));
		inList.remove(new Integer(minValue));
		int secondMaxValue=inList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int secondMinValue=inList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Stream Second Max: "+secondMaxValue);
		System.out.println("Stream Second Min: "+secondMinValue);
	}

}
