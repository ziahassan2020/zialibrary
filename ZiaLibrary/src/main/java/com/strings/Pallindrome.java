package com.strings;

public class Pallindrome {

	
//	static String s = "Today";
	public static void main(String[] args) {
		String s = "MOM";
		StringBuilder builder = new StringBuilder(s);
	//	StringBuffer builder = new StringBuffer(s);
		if(s.equals(builder.reverse().toString())) {
			System.out.println(s+ " is a Pallindrome");
		}
		else {
			System.out.println(s+ " is not Pallindrome");
		}
	}
}
