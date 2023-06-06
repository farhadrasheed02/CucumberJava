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
				plugin= {"pretty","json:target/JSONReports/reports.json"   // for json report 
                          ,"junit:target/JUnitReports/report.xml",
                          "html:target/HtmlReports/reports.html"
                          } // for junit report 
		)

public class Runner {

}
