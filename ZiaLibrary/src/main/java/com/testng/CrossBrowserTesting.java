package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	@Test
	@Parameters("Browser")
	public void test(String name) {
		System.out.println(name);
		if(name.equalsIgnoreCase("chrome")) {
			System.out.println("Open Chrome Browser");
		} else if(name.equalsIgnoreCase("firefox")) {
			System.out.println("Open firefox driver");
		}
		
	}
	

}
