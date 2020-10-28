package com.sarower.exception;

public class TestExecution {

	public static void main(String[] args) throws Exception {
		
		ExceptionMethod obj = new ExceptionMethod();
		obj.getSalary(19000);
		System.gc();
	}

}
