package TestRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@Test
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/Features/login.feature",
		glue={"StepDefinations"},
		tags="@TestingToday",
		monochrome=true,
				plugin= {"pretty","json:target/JSONReports/report.json"}  // for json report 
      	//plugin= {"pretty","junit:target/JUnitReports/report.xml"} // for junit report 
		)

public class Runner {

}
