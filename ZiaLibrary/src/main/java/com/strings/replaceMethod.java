package com.strings;

public class replaceMethod {

	public static void main(String[] args) {
		
		String a = "10,442.75$";
	//	String b = a.replace("$", "").replace(",","");	
		String b = a.replace("$", "").replace(",","");	
		System.out.println(b);
		String name = "New York";
		String c= name.replace("York", "Jersey");
		System.out.println(c);
		
		//Replace Method by regex (regular expression)
		//String text = "SMARTTECH1234568#@$%&^";
	//	String text = "United States Of America";
	//	System.out.println(text.replace("Of","NY"));	 // replace --> replaces one word
//		String text = "United 123 State#$ Of //America";   //Java regular expression or Java regex
//		System.out.println(text.replaceAll("\\d", ""));  //remove all number
//		System.out.println(text.replaceAll("\\D",""));  //remove all letter + sign
//		System.out.println(text.replaceAll("\\s",""));  //remove all empty space
//		System.out.println(text.replaceAll("\\w", ""));  //remove all letter+number
//		System.out.println(text.replaceAll("\\W",""));   //remove all special sign	
//		System.out.println(text.replaceAll("\\d","").replaceAll("\\W","")); //remove number and special characters.
//		System.out.println(text.replaceAll("[a-zA-Z]","")); // remove letters
//		System.out.println(text.replaceAll("[0-9]",""));  // remove numbers
//		System.out.println(text.replaceAll("[a-zA-Z_0-9]",""));   //remove number and letters
//		System.out.println(text.replaceAll("[a-zA-Z_0-9_$#/]","")); // remove letters, numbers and special characters
	//	System.out.println(text.replaceAll("[0-9_$#/]","")); // remove number and special characters.

	}

}
