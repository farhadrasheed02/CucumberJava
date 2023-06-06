package RESTAssured;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class BooksReq {
	@Test
	public void GetBookDetails()
	{
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given(); 
		Response response = httpRequest.get();
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
	}

	public static void main(String[] args) {
		
		
	}

}
