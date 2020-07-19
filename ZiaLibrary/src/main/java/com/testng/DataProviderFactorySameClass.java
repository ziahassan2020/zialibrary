package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderFactorySameClass {
	
	private String email;
	private String value;
	
	@Factory(dataProvider="dataProviderMethod")
	public DataProviderFactorySameClass(String name, String id) {
		this.email = name;
		this.value = id;
	}
	
	@DataProvider
	public static String[][] dataProviderMethod(){
		String[][] arrTest = {{"ZIA","1234"},{"HASSAN","7894"}};
		return arrTest;
	}
	@Test(priority=2)
	public void test1() {
		System.out.println("Test 1 Email= "+email+" ID= "+value);
	}
	@Test(priority=0)
	public void test2() {
		System.out.println("Test 2 No Parameter");
	}
	
	@Test(priority=1)
	public void test3() {
		System.out.println("Test 3 name= "+email);
	}
	
}
