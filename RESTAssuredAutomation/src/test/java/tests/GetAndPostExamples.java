package tests;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class GetAndPostExamples {
	@Test
	public void testGet() {
		
		baseURI="https://reqres.in/api/";
		
		given().
		get("users?page=2").
		then().
		statusCode(200).
		body("data[4].first_name",equalTo("George")).
		body("data.first_name",hasItems("George","Rachel"));
	}
	@Test
	public void testPost() {
		
		/*
		 * Map<String,Object> map=new HashMap<String, Object>();
		 * map.put("name","test1"); map.put("job","Teacher");
		 */
		
		JSONObject request=new JSONObject();
		request.put("name","test1");
		request.put("job","Teacher");
		System.out.println(request.toJSONString());
		baseURI="https://reqres.in/api/";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("users").
		then().
		statusCode(201).log().all();
	}
	

}
