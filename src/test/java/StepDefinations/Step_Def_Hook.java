package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def_Hook {
	@Given("when user enters login")
	public void when_user_enters_login() {
	   System.out.println("user is on Login page");
	}

	@And("enters credentials")
	public void enters_credentials() {
	   System.out.println("Entered UserName and Password");
	}

	@When("authenticate the cred")
	public void authenticate_the_cred() {
	    System.out.println("Authenticating the Creditionals entered");
	}

	@Then("lands on Home page")
	public void lands_on_landing_page() {
	    System.out.println("Finally the cred got successful and lands on the home page");
	}

}
