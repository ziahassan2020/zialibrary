package com.smarttech.excercise;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "UNITED STATES OF AMERICA";
		String[] pieces = name.split(" ");
		System.out.println(Arrays.toString(pieces));
		
		for(int i=0; i<pieces.length;i++) {
			System.out.println(pieces[i]);
		}
	}

}
