package com.restassured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.Map;
import java.util.Map.Entry;
import io.restassured.response.Response;

public class PostResponse {
	
	@Test
	public void postResponseMultiUser() {
				
		baseURI="https://reqres.in/api/users";
		given().urlEncodingEnabled(true)
		.param("name", "Zia")
		.param("job", "Programer")
		.then().statusCode(200);
		
		Response response=get("https://reqres.in/api/users");
		System.out.println(response.getStatusCode());
		Map<Object, Object> data = response.jsonPath().getMap("");
		for(Entry<Object, Object> item:data.entrySet()) {
			System.out.println("Map: "+item);
		}
		
	}

}
