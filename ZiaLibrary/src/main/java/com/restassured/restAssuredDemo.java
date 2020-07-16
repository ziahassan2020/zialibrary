package com.restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class restAssuredDemo {

	@Test
	public void Test01() {
	//	https://reqres.in/api/users?page=2
	//	RestAssured.get("https://reqres.in/api/users?page=2");
	//	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("1. "+response.asString());
		System.out.println("2. "+response.getBody().asString());
		System.out.println("3. "+response.getStatusCode());
		System.out.println("4. "+response.getStatusLine());
		System.out.println("5. "+response.getHeader("content-type"));
		System.out.println("6. "+response.getTime());
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);  // Failed code is 200
	}
	//https://github.com/rest-assured/rest-assured/wiki/Usage
	@Test
	public void Test02() {
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]", equalTo(7));   //responseAwareMatcher
	}

}
