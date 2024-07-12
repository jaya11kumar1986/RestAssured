package practice;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class practiceOne {
	@Test
	public void sample() {
		
		baseURI="http://localhost:3000/";
		given().
		get("employees").then().statusCode(200).log().all();
		
		
		
		
		
	}

}
