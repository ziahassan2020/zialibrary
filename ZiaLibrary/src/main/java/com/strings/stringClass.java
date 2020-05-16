package com.strings;

public class stringClass {
	
	static String name = "ZIA";
	static String obj = new String("HELLO");
	static StringBuffer strBuf = new StringBuffer("ZAINAB");
	static StringBuilder strBuild = new StringBuilder("SADIA");

	public static void main(String[] args) {
		System.out.println(name.concat(" HASSAN")); //Immutable --> String pool (Cannot Change)
		System.out.println(obj.concat(" WORLD")); // Immutable --> String pool (Cannot Change)
		System.out.println(strBuf.append(" HASSAN")); // Mutable --> Java Heap (Can Change)
		System.out.println(strBuild.append(" ZIA"));  // Mutable --> Java Heap (can change)
		
		
	}

}
