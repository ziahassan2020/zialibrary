package com.loop;

import java.util.Arrays;

public class ForLoop {

	public static void main(String[] args) {
		// to remove middle part then this for loop becomes infinite loop
		for (int i=0; i<=10;i++) {
			System.out.println("X:"+i);
		}
		for(int i=15; i>=5; i--) {
			System.out.println(i);
		}
		
		String name = "United State Of America";
		
		System.out.println(name.length());
		for (int i=0; i< name.length();i++) {   // Positive Loop
			System.out.println(name.charAt(i));		
		}
		System.out.println("*********"); 
		for (int i=name.length()-1;i>=0; i--) { // Negavtive Loop
			System.out.println(name.charAt(i));
		}
		
		String name1 = "I am living in New york";
		System.out.println(name1.length());
		for (int i=0; i< name1.length();i++) {   // Positive Loop
			System.out.println(name1.charAt(i));		
		}
		
		System.out.println("*********"); 
		for (int i=name.length()-1;i>=0; i--) { // Negavtive Loop
		//	System.out.println(name.charAt(i));  //single characher
			System.out.print(name.charAt(i));  //single line
		}
		System.out.println("*********");
		StringBuffer obj = new StringBuffer("My Name is Zia");
		System.out.println(obj.reverse());	
	

		
		String name2 = "United State of America";
		for(int i=0; i< name2.length();i++) {  //Positive loop   // Find E
			if(name.charAt(i) == 'E')  {
				System.out.println(name2.charAt(i));
			}
		}
		
		String name3 = "UNITED STATE OF AMERICA"; 
		for(int i=name3.length() -1; i >= 0; i--) {  //Negative loop			
			System.out.println(name.charAt(i));							
		}
		
		StringBuffer strBuff = new StringBuffer("UNITED STATE OF AMERICA");  //Reverse without loop
		System.out.println(strBuff.reverse());
		
		String name4 = new String("United State Of America");		
		System.out.println(Arrays.toString(name4.split(" ")));		
		
		
		for(int i=0; i<=100; i++) {
			System.out.println(i);
			if(i==20) {
				break;
			}
			if(i%2==0){   // i divided by 2 i/2
				System.out.println("This is even Number: "+i);
			} 
			else {
				System.out.println("This is odd number: "+i);
			}
			//FIZZBUZZ numbers
			if(i%3==0 && i%5==0) {   // i divided by 2 i/2
				System.out.println("This is my FizBuzz number: "+i);
			}	
		//	 fizz % 3
			if(i%2==0){   // i divided by 2 i/2
				System.out.println("This is my Fizz number: "+i);
			}	
			if(i%6==0) {
				System.out.println("This is Buzz number: "+i);
			}
		}			

	}
}
