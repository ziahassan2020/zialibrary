package com.smarttech.excercise;

public class MiscString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ZIA";
		String s2="HASSAN";
	//	System.out.println(s1=s2);
		s2=s2.intern();
		System.out.println(s2);
		System.out.println(s1==s2);  // print boolean
	}

}
