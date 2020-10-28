package com.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;
public class ShomirPostResponse {

		@Test
		public void test01() {
			Map<String,Object> map = new HashMap<String, Object>();  // key is string and value is object (to handle numeric or alpha numeric)
			map.put("name", "Zia");
			map.put("Job", "QA");
			System.out.println(map);
			
			JSONObject request = new JSONObject(map);
			System.out.println(request);
			System.out.println(request.toJSONString());
			given()
			.body(request.toJSONString())
			.when().post("https://reqres.in/api/users")
			.then()
			.statusCode(201);
			
			given()
				.header("Content-Type","application/JSON")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.post("https://reqres.in/api/users")
				.then()
				.statusCode(201);		
			
		}
		
		// Without Map
		@Test
		public void test02() {
			JSONObject request = new JSONObject();
			request.put("name","Hassan");
			request.put("Job","Hello");
			
			given()
			.body(request.toJSONString())
			.when().post("https://reqres.in/api/users")
			.then()
			.statusCode(201);
		}
	
//		@Test
//		public void test02() {
//			given().get("https://reqres.in/api/users?page=2")
//			.then()
//			.statusCode(200)
//			.log().all();   // to print on consol			
//			
//		}
		
}
