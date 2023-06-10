package NodeJsServerLocalAPI;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class TestOnLocalAPI {
	@Test
	public void getreq()
	{
		baseURI="http://localhost:3000";
		given().get("/data")
		.then().statusCode(200)
		.body("[0].first_name", equalTo("Haseena"))
		.log().all();
		
	}
	@Test
	public void postreq()
	{
		JSONObject jobj =new JSONObject();
		jobj.put("id", "12");
		jobj.put("email","arifrashid@reqres.in");
		jobj.put("first_name","Arif");
		jobj.put("last_name","Reshi");
		
		System.out.println(jobj.toJSONString());
		baseURI="http://localhost:3000";
		given()
		.header("Content-Type","application/json")
		.body(jobj.toJSONString())
		.when()	
		.post("/data")
		.then()
		.statusCode(201)   // to create a request the status code should be 201....
		.log().all();
	}
	@Test
	public void putreq()
	{
		JSONObject jobj =new JSONObject();
		jobj.put("id", "7");
		jobj.put("email","farhad.reshi@reqres.in");
		jobj.put("first_name","Farhad Rashid");
		jobj.put("last_name","Reshi");
		
		System.out.println(jobj.toJSONString());
		baseURI="http://localhost:3000";
		given()
		.header("Content-Type","application/json")
		.body(jobj.toJSONString())
		.when()	
		.put("/data/7")  // in which section you are trying to update...
		.then()
		.statusCode(200)   // to create a request the status code should be 201....
		.log().all();
	}
		@Test
	public void Deletereq()
	{
	
		
		baseURI="http://localhost:3000";
		given().	
		when().delete("/data/11")  // in which section you are trying to update...
		.then()
		.statusCode(200)   // to create a request the status code should be 201....
		.log().all();
	}

}
