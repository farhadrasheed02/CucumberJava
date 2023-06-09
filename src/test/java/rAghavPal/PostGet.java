package rAghavPal;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.*;
@Test
public class PostGet {
	@Test
	public void getreq()
	{
		baseURI="https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		log().all().
		body("data[4].first_name",equalTo("George"));
		
	}

}
