package com.sarower.exception;

public class ExceptionMethod {
	
	public void getSalary(int salary) throws Exception {
		
		if(salary<10000) {
			System.out.println("This is employee salary of Smarttech");
		} else {
			throw new Exception("This is not Smarttech salary of any employee");
		}
		System.out.println("Finish");
	}

}
