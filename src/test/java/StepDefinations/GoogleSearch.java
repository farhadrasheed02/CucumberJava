package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver webdriver = null;
	@Given("whe user search goole")
	public void whe_user_search_goole() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		webdriver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

	}

	@When("user is on search button")
	public void user_is_on_search_button() {
		webdriver.navigate().to("https://www.google.com");
	}

	@And("click on the enter")
	public void click_on_the_enter() {
		webdriver.findElement(By.name("q")).sendKeys("Automation step by step");
	   
	}

	@Then("user goes to the result")
	public void user_goes_to_the_result() {
		webdriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
	}
	@Then("click on the online courses")
	public void click_on_the_online_courses() {
		webdriver.getPageSource().contains("Online Courses");
		//webdriver.close();
	}




}
