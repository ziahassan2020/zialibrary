package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		//remove duplicates with loop
		//10,20,10,20,30,30,40
		
		List<Integer> myList = new ArrayList<>(Arrays.asList(10,20,10,20,30,30,40));
		System.out.println("Original values="+myList);
		for(int i=0;i<myList.size();i++) {
			for(int j=i+1;j<myList.size();j++) {
				if(myList.get(i) == myList.get(j)) {
					myList.remove(j);
				}
			}
		}
		System.out.println("Remove Duplicate With Loop="+myList);	
		//remove duplicate without loop		
		Set<Integer> mySet = new HashSet<>(Arrays.asList(10,20,10,20,30,30,40));
		System.out.println("Remove Duplicate Without Loop="+mySet);
		
		//Remove duplicate and Asc sort
		Set<Integer> myTreeSet = new TreeSet<>(Arrays.asList(10,20,10,20,30,30,40));
		System.out.println("Remove Duplicate Without Loop Sorted="+myTreeSet);
		
	}

}
