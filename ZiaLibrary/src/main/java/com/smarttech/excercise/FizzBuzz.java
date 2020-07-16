package com.smarttech.excercise;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 is fizz and 5 is buzz
		for(int i=1;i<=30;i++) {
			if(i%3 ==0 && i%5==0) {
				System.out.println(i+ "is fizz buzz");
			} else if(i%3==0) {
					System.out.println(i +" is Fizz");
			} else if(i%5==0) {
				System.out.println(i +" is Buzz");				
			}
		}
			
	}

}


