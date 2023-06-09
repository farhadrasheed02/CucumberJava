package rAghavPal;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.*;
@Test
public class PostGet {
	@Test
	public void getreq()   // this request is used to read data from the api(https://reqres.in/api/users?page=2)
	{
		baseURI="https://reqres.in/";
		given().
		get("api/users?page=2").
		then().
		statusCode(200).
		log().all().
		body("data[4].first_name",equalTo("George"));
		
	}
	
	public void postreq()
	{
		
	}

}
