package com.strings;

public class reverseString {

	public static void main(String[] args) {
		
		//Reverse String without loop
		StringBuffer strBuff = new StringBuffer("United States of America");
		System.out.println(strBuff.reverse());
		
		System.out.println("****************");
		StringBuilder strBdr = new StringBuilder("UNITED STATE OF AMERICA");  //Reverse without loop
		System.out.println(strBdr.reverse());	
		
		//Reverse String with loop
		System.out.println("********************");		
		String str = "UNITED STATES OF AMERICA";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));			
		}
		
		//How many E in UNITED STATES OF AMERICA
		System.out.println("********************");
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='E') {
				System.out.println(str.charAt(i));
			}
		}
		
		//Find MOM in Pallindrome
		String s="MOM";
		StringBuilder obj = new StringBuilder(s);		
		if(s.equals(obj.reverse().toString())) {
			System.out.println("This is Pallindrome");
		}
		else {
			System.out.println("This is not Pallindrome");
		}
		
		String a = "10,442.75$";
		System.out.println(a.replace(",", "").replace("$", ""));
	}

}
