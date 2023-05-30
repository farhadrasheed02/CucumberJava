package RunnerFile;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/main/resources/Features/login.feature",
   //path of step definition file
   glue = "StepDefinations"
   )

public class TestRun {

}
