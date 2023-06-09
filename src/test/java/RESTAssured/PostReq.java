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
/*	public void GeeksforGeek()
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
	*/
	
	
	@Test
	public void PostReqMeth()
	{
		//sending request body as String ....
		String pbody ="{\"id\":50,"
				+ "email\":\"swethana.v@reqres.in\","
				+ "\"first_name\":\"swetha\","
				+ "\"last_name\":\"v\","
				+ "\"avatar\":\"https://reqres.in/img/faces/8-image.jpg\"}";
		RestAssured.baseURI="https://reqres.in";
		given().header("Content-Type","application/json").body(pbody)
		.when().post("api/users")
		.then()	.log().all().assertThat().statusCode(400).assertThat()
		.body("email",equalTo("swethana.v@reqres.in"));
//		Response res =RestAssured.get("https://reqres.in/api/users");
//		System.out.println("Status received => " + res.getStatusLine()); 
//		System.out.println("Response=>" + res.prettyPrint());
		 
		
	}
	@Test
	public void getmethodPost()
	{
		
		JSONObject jsObj = new JSONObject();
		jsObj.put("id","50");
		jsObj.put("email","swethana.v@reqres.in");
		jsObj.put("first_name", "swetha");
		jsObj.put("last_name","v");
		jsObj.put("avatar","https://reqres.in/img/faces/8-image.jpg");
		 given().header("Content-Type","application/json").body(jsObj.toJSONString()).
		 when().post("https://reqres.in/api/users").
		 then().log().all().assertThat()
		 .statusCode(201)
		 .body("first_name",equalTo("swetha"));
		
		
	}

	public static void main(String[] args) {

	}

}
