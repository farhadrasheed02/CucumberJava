package rAghavPal;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchDeleteExample {
	@Test
	public void Put()
	{	JSONObject json = new JSONObject();
		json.put("name", "farhad");
		json.put("Religion", "Islam");
		System.out.println(json.toJSONString());
		
		baseURI="https://reqres.in/";
		given()
			.header("Content-Type"," application/json")
			.body(json.toJSONString())
		.when()
			.put("api/users/2")   // updating the values in the api...
		.then()
			.statusCode(200)  //   for put status code should be 200
		.log().all();
	}
	@Test
	public void Patch()
	{	JSONObject json = new JSONObject();
		json.put("name", "farhad");
		json.put("Religion", "Islam");
		System.out.println(json.toJSONString());
		
		baseURI="https://reqres.in/";
		given()
			.header("Content-Type"," application/json")
			.body(json.toJSONString())
		.when()
			.patch("api/users/2")   // updating the values in the api...
		.then()
			.statusCode(200)  //   for put status code should be 200 ...
		.log().all();
	}
	@Test
	public void Delete()
	{	JSONObject json = new JSONObject();
		json.put("name", "farhad");
		json.put("Religion", "Islam");
		System.out.println(json.toJSONString());
		
		baseURI="https://reqres.in/";
		given()
			.header("Content-Type"," application/json")
			.body(json.toJSONString())
		.when()
			.delete("api/users/2")   // updating the values in the api...
		.then()
			.statusCode(204)  //   for delete status code should be 200
		.log().all();
	}

}
