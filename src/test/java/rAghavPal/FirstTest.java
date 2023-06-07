package rAghavPal;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
@Test
public class FirstTest {
			public void Testing()
			{
			Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getBody().asString());
		System.out.println(response.statusCode());
		System.out.println(response.getStatusCode());
		System.out.println(response.contentType());
			}
}
