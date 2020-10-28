package com.restassured;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GetResponseMultiUser {
	
	@Test
	public void getResponse() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("Response: "+response.asString());
		System.out.println("Body: "+response.getBody().asString());
		System.out.println("Status Code: "+response.getStatusCode());
		System.out.println("Status Line: "+response.getStatusLine());
		System.out.println("Content Type: "+response.getContentType());		
		List<Map<String, String>> data = response.jsonPath().getList("data");		
		for(int i=0; i<data.size();i++) {
			for(Map.Entry<String, String> item:data.get(i).entrySet()) {
				System.out.println("Map: "+i+": "+item);
			}
		}
		System.out.println("ID: "+String.valueOf(data.get(1).get("id")));
		System.out.println("Email: "+data.get(1).get("email"));
		Map<String, String> ad = response.jsonPath().getMap("ad");
		for(Map.Entry<String, String> item:ad.entrySet()) {
			System.out.println("Ad: "+item);
		}
		System.out.println("URL: "+ad.get("url"));
		int statusCode = response.getStatusCode();
		assertEquals(statusCode, 200);		
	}
	
	@Test  // By Behaviour data development
	public void getResponseBDD() {
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
		.body("data.id[0]", equalTo(7));
		
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
		.body("data.email[0]", equalTo("michael.lawson@reqres.in"))
		.log().all();
	}

}
