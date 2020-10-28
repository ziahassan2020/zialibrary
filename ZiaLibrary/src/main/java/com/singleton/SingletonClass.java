package com.singleton;

public class SingletonClass {
	
	private static SingletonClass single_instance=null;
	public String s;
	
	private SingletonClass() {
		s="This is my SingletonClass constructor";		
	}
	public static SingletonClass getInstance() {
		if(single_instance == null) {
			single_instance = new SingletonClass();
			System.out.println("yyyyy");
		}
		return single_instance;
		
	}

}
