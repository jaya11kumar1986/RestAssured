package practice;


import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

public class JsonInformGet {
	@Test
	public void getValue() {
		
		baseURI="http://localhost:3000/";
		given().
		get("employees").
		then().
		statusCode(200).
		log().all();
		
		}
	@Test
	public void createDetail() {
		
		File jsonFile=new File("postData.json");
		
		given().
		baseUri("http://localhost:3000/").
		header("Content-Type","application/json").
		body(jsonFile).
		when().
		post("/employees")
		.prettyPrint();
	}

}
