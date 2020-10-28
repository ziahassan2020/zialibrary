package com.sarower.restassured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponse {
	
	@Test
	public void test1() {
		Response obj = RestAssured.get("http://localhost:3000/posts");
		// HTTP 3 parts of request body, header, status line
		//System.out.println(obj.body().print());
//		obj.body().print();  // if .print exist then no need syso
		
		System.out.println("HTTP status line: "+obj.getStatusLine());
		System.out.println();
		obj.body().prettyPrint();  // Json Format 
		System.out.println("HTTP Status Code: "+obj.getStatusCode());
		System.out.println("HTTP Header: "+obj.getHeaders());
		System.out.println();
		System.out.println("Time: "+obj.getTime()+" ms");   // in milli seconds
		System.out.println("Application type /server type/language: "+obj.getContentType());
		
		//Validation of API Testing for status code	
		if(obj.getStatusCode()==200) {
			Assert.assertEquals(obj.getStatusCode(), 200, "Test passed as status code found 200");
			System.out.println("My Test Passed");
		} else {
			System.out.println("My Test Failed");
		}
		
		if (obj.getStatusLine().contains("OK")) {
			Assert.assertTrue(obj.getStatusLine().contains("OK"), "Test Passed");
			
		} else {
			System.out.println("My status line test failed");
		}		
	}
	
}
