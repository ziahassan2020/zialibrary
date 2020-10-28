package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowDuplicates {

	public static void main(String[] args) {
		//remove duplicates with loop
		//10,20,10,20,30,30,40
		
		List<Integer> myList = new ArrayList<>(Arrays.asList(10,20,10,20,30,30,40));
		System.out.println("Original values="+myList);
		for(int i=0;i<myList.size();i++) {
			for(int j=i+1;j<myList.size();j++) {
				if(myList.get(i) == myList.get(j)) {
					System.out.println("This is Duplicate #: "+myList.get(i).toString());
				}
			}
		}
	//	System.out.println("Remove Duplicate With Loop="+myList);	

	}

}
