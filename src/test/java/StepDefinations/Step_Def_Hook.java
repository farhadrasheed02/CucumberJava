package StepDefinations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Def_Hook {
	WebDriver driver;
	File file;
	@AfterMethod
	public void ScreenShot(ITestResult result)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			file =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File("C:\\Users\\Farhad Rashid Reshi\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\Results\\screen.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
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
	@Then("report will be generated in file in hook")
	public void generate_report() {
		 
		File file = new File("src/test/resources/Resultss/Log.txt");
		try {
			PrintStream stream = new PrintStream(file);
			System.out.println("From now onwards"+file.getAbsolutePath()+"will be you console");
		
			System.setOut(stream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	} 

}
