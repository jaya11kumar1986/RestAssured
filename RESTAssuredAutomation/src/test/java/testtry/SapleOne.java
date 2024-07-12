package testtry;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SapleOne {
	@Test
	public void testOne() {
		
		Response response = RestAssured.get("https://reqres.in/");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
	}

}
