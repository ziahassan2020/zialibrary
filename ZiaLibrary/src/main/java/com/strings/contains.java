package com.strings;

public class contains {

	public static void main(String[] args) {
		
		String text = "United State Of America";
		System.out.println(text.contains("Of"));
		if(text.contains("America")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}

}
