package com.singleton;

public class DriverClass {
	public static void main(String[] args) {
		
//		SingletonClass a = new SingletonClass(); //it is not possible b/c constuctor is private
		SingletonClass x = SingletonClass.getInstance();
		SingletonClass y = SingletonClass.getInstance();
		// No matter how many object create i will get the same instance
		
//		SingletonClass a = new SingletonClass();
//		SingletonClass b = new SingletonClass();
//		SingletonClass c = new SingletonClass();
		
		System.out.println(x.s);
		System.out.println(y.s);
	}

}
