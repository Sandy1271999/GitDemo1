package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = "stepDefenition",stepNotifications=true,plugin= {"pretty","html:target/cucumber.html"},monochrome=true)
public class Singup_Signin_RunnerClass {

}
