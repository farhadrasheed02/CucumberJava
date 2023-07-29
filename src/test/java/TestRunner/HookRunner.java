package TestRunner;

import io.cucumber.junit.CucumberOptions;


@org.testng.annotations.Test
@CucumberOptions(
		features="src/main/resources/Features/Hook.feature",
		tags="@HookFeature",
		glue="StepDefinations"
				//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class HookRunner {

}
