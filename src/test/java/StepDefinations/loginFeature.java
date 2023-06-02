package StepDefinations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFeature {
	static PrintStream stream;
	@Then("report will be generated in file")
	public void generate_report() {
		 
		File file = new File("src/test/resources/Results/Log.txt");
		try {
			 stream = new PrintStream(file);
			System.out.println("From now onwards"+file.getAbsolutePath()+"will be you console");
		//	System.out.println("==============="+file.getAbsolutePath());
			System.setOut(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
  
	@Given("user is on login page")
	public void login_page() {
		System.out.println("In login page");
	    
	}

	@When("user enters username and password")
	public void username_and_password() {
		System.out.println("In user name and password section");
	   
	}

	@And("clicks on login button")
	public void login_button() {
		System.out.println("On login button");
	    
	}

	@Then("user is navigated to the login page")
	public void navigated_to_the_login_page() {
		System.out.println("I am navigated to the login page wadrobe");
	}
	



}
