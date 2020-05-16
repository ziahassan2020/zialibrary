package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayTest {

	public static void main(String[] args) {
		
			int[] a = {10,20,10,30,40,20,30};
			
			System.out.println("Print Array: "+Arrays.toString(a));
			System.out.println("**********");
							
//			Arrays.sort(a);
//			System.out.println("Sorted Asc: "+Arrays.toString(a));
			ArrayUtils.reverse(a);
//			System.out.println("Sorted Desc: "+Arrays.toString(a));		
			
			Set<Integer> mySet = new HashSet<>();
			Set<Integer> myTreeSet = new TreeSet<>();
			for(int i=0;i<a.length;i++) {
				mySet.add(a[i]);
				myTreeSet.add(a[i]);
			}
			System.out.println("List without duplicate="+mySet);
			
		//	Set<Integer> myTreeSet = new TreeSet<>(mySet);
			System.out.println("Asc order="+myTreeSet);
	}

}
