package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFeature {
	@Given("user is on login page")
	public void login_page() {
		System.out.println("In login page");
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user enters username and password")
	public void username_and_password() {
		System.out.println("In user name and password section");
	    // Write code here that turns the phrase above into concrete actions
	}

	@And("clicks on login button")
	public void login_button() {
		System.out.println("On login button");
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user is navigated to the login page")
	public void navigated_to_the_login_page() {
		System.out.println("I am navigated to the login page wadrobe");
	}



}
