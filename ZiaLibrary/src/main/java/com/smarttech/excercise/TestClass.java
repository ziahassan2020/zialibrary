package com.smarttech.excercise;


public class TestClass {
	
	String name=null;  // instance variable
	static String address = null;  //Static variable
	
//	public TestClass() {
//		System.out.println("Default Constructor of parent class");
//	}
	
//	public TestClass(int a) {  //overloading/compile time poly morphism
//	//	this();		
//		System.out.println("Parameterized Constructor= "+a);
//		
//	}
//	public TestClass(int a, int b) {
//	//	this(50);
//		System.out.println("Parameterized Constructor= "+a+" "+b);
//	}	
	
	public void getSalary() {		
		address = "NEW YORK";
		name = "Steve";
		String x = "Smarttech";
		String y = new String("Smarttech");  // O
		System.out.println(y);
		// datatype variable = value;  member
		int a= 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
		
	}
	public int getSalary(int salary, int comm) {
		int net = salary+comm;
		return net;
	}
}

