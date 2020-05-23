package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		myList.add("ZIA");
		myList.add("ZIA");
		myList.add("HASSAN");
		myList.add(null);
		myList.add(null);
	//	System.out.println("Set List = "+myList);
		
		// It remove duplicates and handle ony one null
		
		Set<String> mySet = new HashSet<>();
		mySet.add("ZIA");
		mySet.add("ZIA");
		mySet.add("HASSAN");
		mySet.add(null);
		mySet.add(null);
		System.out.println("Hash Set Value = "+mySet);
//		for (int i=0;i<mySet.size();i++) {
//			System.out.println("MY SET LOOP="+mySet.toString().indexOf(i));
//		}
		for(String i:mySet) {
			System.out.println("My set ="+i);
		}
		
		Set<String> myLinkedSet = new LinkedHashSet<>();
		myLinkedSet.add("ZIA");
		myLinkedSet.add("ZIA");
		myLinkedSet.add("HASSAN");
		myLinkedSet.add(null);
		myLinkedSet.add(null);
	//	System.out.println("Linked Hash Set Value = "+myLinkedSet);
		
		Set<Integer> myTreeSet = new TreeSet<>();
		myTreeSet.add(30);
		myTreeSet.add(10);
		myTreeSet.add(10);
	//	myTreeSet.add(null);
	//	myTreeSet.add(null);
//		System.out.println("Tree Set Value = "+myTreeSet);
		
		Set<String> myTreeSet2 = new TreeSet<>();
		myTreeSet2.add("ZIA");
		myTreeSet2.add("HASSAN");
		myTreeSet2.add("ZIA");
	//	myTreeSet2.add(null);
	//	myTreeSet2.add(null);
	//	System.out.println("Tree Set Value = "+myTreeSet2);
		
		List<Integer> myList2 = new ArrayList<>();
		
		myList2.add(10);
		myList2.add(20);
		myList2.add(10);
		myList2.add(30);
		myList2.add(20);
		System.out.println("List Value = "+myList2);
		System.out.println("Max List: "+Collections.max(myList2));
		
		Set<Integer> mySet2 = new HashSet<>(myList2);
		System.out.println("Set Value without duplicate ="+mySet2);
		
		Set<Integer> myTreeSet3 = new TreeSet<>(myList2);
		System.out.println("Tree Set Asc order and remove the duplicate = "+myTreeSet3);
		
		
		
	}

}
