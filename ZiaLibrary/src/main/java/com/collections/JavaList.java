package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();   // Upcasting polymorphism
		//myList is an object or reference variable.
		myList.add("Milk");
		myList.add("Meat");
		myList.add("Egg");
		
		System.out.println(myList);
		
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		for(String i:myList) {
			System.out.println(i);
		}
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//Find min and Max
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		// Sorting Asc order
		Collections.sort(list);
		System.out.println(list);
	}

}
