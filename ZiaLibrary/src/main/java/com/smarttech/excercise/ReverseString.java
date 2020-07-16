package com.smarttech.excercise;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("UNITED STATES OF AMERICA");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		System.out.println("***********By String Buffer**********");
		StringBuffer a = new StringBuffer(name);
		System.out.println("String Buffer: "+a.reverse().toString());
			
	}

}
