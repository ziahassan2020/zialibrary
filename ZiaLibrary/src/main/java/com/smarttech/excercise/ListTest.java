package com.smarttech.excercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {22,33,11,44,11,44,22,33,55};
		ListTest obj = new ListTest();
		obj.byArrayList(arr);
		obj.byLinkedList(arr);
		obj.byVector(arr);
		obj.byStack(arr);

	}
	public void byArrayList(int[] inArray) {
		List<Integer> myArrList = new ArrayList<>();
		for(int i=0;i<inArray.length;i++) {
			myArrList.add(inArray[i]);
		}
		System.out.println("Array List: "+myArrList); // No Order
	}
	public void byLinkedList(int[] inArray) {
		List<Integer> myLinkedList = new LinkedList<>();
		for(int i=0;i<inArray.length;i++) {
			myLinkedList.add(inArray[i]);
		}
		System.out.println("Linked List: "+myLinkedList); //Insertion/Linked order
	}
	public void byVector(int[] inArray) {
		List<Integer> myVector = new Vector<>();
		for(int i=0;i<inArray.length;i++) {
			myVector.add(inArray[i]);
		}
		System.out.println("Vector: "+myVector); // Natural or Asc order
	}
	public void byStack(int[] inArray) {
		List<Integer> myStack = new Stack<>();
		for(int i=0;i<inArray.length;i++) {
			myStack.add(inArray[i]);
		}
		System.out.println("Stack: "+myStack); // Natural or Asc order
	}

}
