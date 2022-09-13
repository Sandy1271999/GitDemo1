package Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/Features",
		glue = "stepDefenition")
public class TestNGRunnerClass extends AbstractTestNGCucumberTests{

}
