package SoapXml;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.maven.surefire.shared.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static  org.hamcrest.Matchers.equalTo;
public class SopaXmlValiation {
 PrintStream stream;

	@Test
	public void soapxmlval()

	{
		baseURI="http://www.dneonline.com";
		
		File file = new File("src/test/java/SoapXml/soapbody.xml");
		
		FileInputStream filestream;
		try {
			filestream = new FileInputStream(file);
		
		String response;
		
			response = IOUtils.toString(filestream,"utf-8");
		 
		
		given()
			.contentType("text/xml")
			.accept(ContentType.XML)
			.body(response)
			.log()
			.all()
			.when()
				.post("/calculator.asmx")
				.then()
			.statusCode(200);
//			.and()
//			.body("//*:AddResult.text()", equalTo(13));
			
			
	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	@Test
	public void generatereport()
	{
		 
		File file = new File("src/Results/Log.txt");
		try {
			 stream = new PrintStream(file);
			System.out.println("From now onwards the Output will be saved  in this location : - "+file.getAbsolutePath()+" and that will be you console");
			
			System.setOut(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}