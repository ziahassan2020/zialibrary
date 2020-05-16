package com.strings;

public class FizzBuzz {

	public static void main(String[] args) {
		// 3 is fizz and 5 is Buzz, Find fizz, buzz and fizzbuzz from 1 to 50
		
		for(int i=1;i<=50;i++) {
			if(i%3 == 0) {
				System.out.println("Fizz#: "+i);
			}
			if(i%5 ==0) {
				System.out.println("Buzz#: "+i);
			}
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz#: "+i);
			}
		}		

	}

}
