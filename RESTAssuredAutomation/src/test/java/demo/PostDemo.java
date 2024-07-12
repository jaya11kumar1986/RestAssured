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

public class PostDemo {
	@Test
	public void postDemo() {

		baseURI="http://localhost:3000/";

		JSONObject js=new JSONObject();
		js.put("firstName","Tamil");
		js.put("lastName","Jayakumar");
		js.put("subjectId",3);

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(js.toJSONString()).
		when().
		post("users").
		then().
		statusCode(201).
		log().all();


	}

}
