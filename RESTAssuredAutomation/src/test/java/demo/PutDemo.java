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

public class PutDemo {
	
	@Test
	public void postDemo() {

		baseURI="http://localhost:3000/";

		JSONObject js=new JSONObject();
		js.put("firstName","Elavenil");
		js.put("lastName","Jayakumar");
		js.put("subjectId",3);

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(js.toJSONString()).
		when().
		put("users/a558").
		then().
		statusCode(200).
		log().all();


	}


}
