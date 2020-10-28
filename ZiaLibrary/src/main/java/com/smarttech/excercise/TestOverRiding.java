package com.smarttech.excercise;

public class TestOverRiding extends TestClass {

	public static void main(String[] args) {
		
		TestOverRiding obj = new TestOverRiding();
		
//		TestClass a = new TestClass();
		System.out.println(obj.getSalary(10,100));
		
	//	obj.getSalary();	

	}
	//child method override parent method if the same method
	
	public int getSalary(int a, String b) {
		System.out.println("This is my Test Overriding method");
		return 5;
	}
	
	public void getAddress() {
		
	}
	

}
