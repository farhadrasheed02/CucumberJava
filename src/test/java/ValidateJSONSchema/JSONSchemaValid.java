package ValidateJSONSchema;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

import org.testng.annotations.Test;

@Test
public class JSONSchemaValid {
	@Test
	public void valid() {
		baseURI="https://reqres.in/";
		given().
		get("api/users?page=2").
		then().
		assertThat().body(matchesJsonSchemaInClasspath("Schema.json")) // refer to https://youtu.be/rkGI32WXmPQ
		// can find the path of this schema.json (C:\Users\Farhad Rashid Reshi\eclipse-workspace\CucumberJava\target\classes)
		.statusCode(200)
		.log().all().
		body("data[4].first_name",equalTo("George"))
		.body("data.first_name",hasItems("Byron", "George","Tobias"));
		
	}

}
