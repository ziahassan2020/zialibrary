package com.restassured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.Map;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


public class GetResponseSingleUser {
	
	@Test
	public void getSingleUserRespond() {
		
		Response response = get("https://reqres.in/api/users/2");
		System.out.println("String: "+response.asString());	
		Map<String, String> data = response.jsonPath().getMap("data");
		for(Map.Entry<String, String> item:data.entrySet()) {
			System.out.println("Map: "+item);
		}
		System.out.println("Email: "+data.get("email"));
		System.out.println("ID: "+String.valueOf(data.get("id")));
	}
	
	@Test
	public void getSingleUserRespondBDD() {
		given().
			get("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			body("data.id", equalTo(2));				
	}

}
