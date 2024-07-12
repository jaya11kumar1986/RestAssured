package demo;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetDemo {
	@Test
	public void getExample() {
		
		baseURI="http://localhost:3000/";
		given().
		get("employees").
		then().
		statusCode(200)
		.log().all();
	}
	
	

}
