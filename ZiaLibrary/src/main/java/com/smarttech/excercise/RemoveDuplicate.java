package com.smarttech.excercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {22,33,11,44,11,44,22,33,55};
		RemoveDuplicate obj = new RemoveDuplicate();
		obj.removeOld(arr);
		obj.removeBySet(arr);
		obj.removeByTreeSet(arr);
		obj.removeByLinkedSet(arr);
		
	}
	public void removeOld(int[] inArray) {
		Boolean flag=true;
		
		int newarr[] = null;
		for(int i=0;i<inArray.length;i++) {
			flag=true;
			for(int j=i+1;j<inArray.length;j++) {
				if(inArray[i]==inArray[j]) {
					flag=false;
				}
			}
			if (flag) {
				System.out.println(inArray[i]);
			}
		}
		//System.out.println(Arrays.toString(newarr));
	}
	public void removeBySet(int[] inArray) {
		Set<Integer> mySet = new HashSet<>();
		for(int i=0;i<inArray.length;i++) {
			mySet.add(inArray[i]);
		}
		System.out.println("Hash Set: "+mySet); // No Order
	}
	public void removeByLinkedSet(int[] inArray) {
		Set<Integer> myLinkedSet = new LinkedHashSet<>();
		for(int i=0;i<inArray.length;i++) {
			myLinkedSet.add(inArray[i]);
		}
		System.out.println("Linked Hash Set: "+myLinkedSet); //Insertion/Linked order
	}
	public void removeByTreeSet(int[] inArray) {
		Set<Integer> myTreeSet = new TreeSet<>();
		for(int i=0;i<inArray.length;i++) {
			myTreeSet.add(inArray[i]);
		}
		System.out.println("Tree Set: "+myTreeSet); // Natural or Asc order
	}

}
