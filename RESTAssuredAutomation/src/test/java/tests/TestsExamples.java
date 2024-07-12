package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestsExamples {
	
	@Test
	public void test_1() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		int statusCode = response.getStatusCode();
		long time = response.getTime();
		String body = response.getBody().asPrettyString();
		
		System.out.println("Staus Code:"+statusCode);
		System.out.println("Time:"+time);
		System.out.println("Body:"+body);
		System.out.println("statusline:"+response.statusLine());
		System.out.println("Header:"+response.getHeader("content-type"));
		
		Assert.assertEquals(statusCode,200);
		System.out.println("Process End Normally");
		
		}
	@Test
	public void test_2() {
		
		baseURI="https://reqres.in/api/";
		
		given().
		  get("users?page=2").
		then().
		  statusCode(200).
		body("data[1].id",equalTo(8)).
		log().all();
		
	}

}
