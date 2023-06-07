package rAghavPal;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
@Test
public class FirstTest {
	@Test
	public void Testing()
	{
		
		// we read the data from the API using get() --> request...GET: This Verb is used to get or read data from a server.
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getBody().asString());
		//System.out.println(response.statusCode());
		System.out.println(response.getStatusCode());
		System.out.println(response.contentType());
		System.out.println(response.getHeader("Content-Type"));

		//Assertion part
		int statuscode = response.getStatusCode();
		String con_type = response.getContentType();
		Assert.assertEquals(statuscode,200);
		Assert.assertEquals(con_type,"application/json; charset=utf-8");
	}
}
