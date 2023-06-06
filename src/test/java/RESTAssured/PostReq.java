package RESTAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.CoreMatchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;

public class PostReq {
	@Test
	public void GeeksforGeek()
	{
		RestAssured
        .get("http://my-api.com/resource/123")
        .then()
        .assertThat()
        .statusCode(200)
        .and()
        .contentType(ContentType.JSON)
        .and()
        .body("id", equalTo(123));
	}
	@Test
	public void PostReqMeth()
	{
		//sending request body as String ....
//		String pbody ="{\"id\":1,"
//				+ "email\":\"george.bluth@reqres.in\","
//				+ "\"first_name\":\"George\","
//				+ "\"last_name\":\"Bluth\","
//				+ "\"avatar\":\"https://reqres.in/img/faces/1-image.jpg\"}";

		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpRequest = RestAssured.given(); 
		Response response = httpRequest.get();
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
		 
		
	}
	public void getmethodPost()
	{
//		JSONObject jsObj = new JSONObject();
//		jsObj.put("id","50");
//		jsObj.put("email","swethana.v@reqres.in");
//		jsObj.put("first_name", "swetha");
//		jsObj.put("last_name","v");
//		jsObj.put("avatar","https://reqres.in/img/faces/8-image.jpg");
//		 given().header("Content-Type","application/json").body(jsObj.toJSONString()).
//		 when().post("https://reqres.in/api/users").
//		 then().log().all().assertThat()
//		 //.statusCode(201).
//		 .body("first_name",equalTo("swetha"));
		
		
	}

	public static void main(String[] args) {

	}

}
