package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSameClass {

	@DataProvider //(name="Method1")
	public static Object[][] dataProviderMethod1(){
		return new Object[][]{{"zia@yahoo.com","1234"},{"hassan@gmail.com","789"},{"steve@yahoo.com","875"}};
	}
	
	@DataProvider
	public static String[][] dataProviderMethod3(){
		String[][] arr = {{"zia@yahoo.com","1234","www.facebook.com"},{"hassan@gmail.com","789","www.cnn.com"}};
		return arr;
	}
//	@Test(dataProvider="Method1")
	@Test(dataProvider="dataProviderMethod3")
	public void test(String val1, String val2, String val3) {
		System.out.println("Test**** "+val1+" "+val2+" "+val3);
	}
	
}
