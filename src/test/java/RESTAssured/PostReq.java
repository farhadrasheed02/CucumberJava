package RESTAssured;

import io.restassured.RestAssured;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.*;

import static io.restassured.RestAssured.given;

public class PostReq {
	@Test
	public void PostReqMeth()
	{
		//sending request body as String ....
		String pbody ="{\"id\":1,"
				+ "email\":\"george.bluth@reqres.in\","
				+ "\"first_name\":\"George\","
				+ "\"last_name\":\"Bluth\","
				+ "\"avatar\":\"https://reqres.in/img/faces/1-image.jpg\"}";
	 RestAssured.baseURI="https://reqres.in/";
	 given().header("Content-Type","application/json").body(pbody).
	 when().post("api/users").
	 then().log().all().assertThat()
	 .statusCode(201).
	 assertThat().body("email",equalTo("george.bluth@reqres.in"));
//		given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
//		  .all();
//		 given().queryParam("CUSTOMER_ID","68195")
//         .queryParam("PASSWORD","1234!")
//         .queryParam("Account_No","1")
//         .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
//         .body();
		
	}

	public static void main(String[] args) {

	}

}
