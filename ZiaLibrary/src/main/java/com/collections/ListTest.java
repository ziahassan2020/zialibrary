package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(null);
		
		System.out.println(myList);
		System.out.println("Max Value: "+Collections.max(myList));
		System.out.println("Min Value: "+Collections.min(myList));
		
		for(int i=0; i< myList.size();i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("*************");
		for(int i:myList) {
			System.out.println(i);
		}
		Collections.sort(myList);
		System.out.println(myList);
		Collections.reverse(myList);
	//	Collections.sort(myList, Collections.reverseOrder());
		System.out.println(myList);

		List<Integer> aa = new Stack<>();
}

}
