package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/Features/GoogleSearch.feature",
		tags="@GoogleSearch",
		glue="StepDefinations"
		
		)
public class GoogleTest {

}
