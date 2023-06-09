package rAghavPal;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.*;

import org.json.simple.JSONObject;
@Test
public class PostGet {
	//@Test
	public void getreq()   // this request is used to read data from the api(https://reqres.in/api/users?page=2)
	{
		baseURI="https://reqres.in/";
		given().
		get("api/users?page=2").
		then().
		statusCode(200).
		log().all().
		body("data[4].first_name",equalTo("George"))
		.body("data.first_name",hasItems("Byron", "George","Tobias"));  // only these elements should be present , sequence is not important...
		
	}
	
	@Test
	public void postreq()
	{
		// i have used json simple libray in our class, you will find the dependency in pom.xml file...
		JSONObject json = new JSONObject();// use library gson, jackson(high performance json processor(parser,generator)) to use json objects..
		json.put("name", "farhad");
		json.put("Religion", "Islam");
		System.out.println(json.toJSONString());
		
		baseURI="https://reqres.in/";
		given()
			.header("Content-Type"," application/json")
			.body(json.toJSONString())
		.when()
			.post("api/users").
		then()
			.statusCode(201)   // to create a request the status code should be 201....
		.log().all();
		
	}
	
	

}
