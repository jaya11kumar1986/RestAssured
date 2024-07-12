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

public class PatchDemo {
	@Test
	public void patchDemo() {

		baseURI="http://localhost:3000/";

		JSONObject js=new JSONObject();
		
		js.put("lastName","SriVidhya");
		

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(js.toJSONString()).
		when().
		patch("users/a558").
		then().
		statusCode(200).
		log().all();


	}

}
