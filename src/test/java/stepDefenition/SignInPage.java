package stepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import PageObjects.POSigninPage;
import Utils.TestContextSetup;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPage {
	
	TestContextSetup testContextSetup;
	POSigninPage signinPageGU;
	
	public SignInPage(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	
	@When("^Login with Username \"([^\"]*)\" & Password \"([^\"]*)\"$")
	public void login_with_username_something_password_something(String userName, String password) throws Throwable 
	{
		//posigninpage = new POSigninPage(testContextSetup.driver);
		POSigninPage signinPageGU = testContextSetup.pageObjectManager.GetSigninPage();
		testContextSetup.impWait.Implicitwait();
		//testContextSetup.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		signinPageGU.signinNavigate();
		signinPageGU.enterCredentials(userName,password);
		signinPageGU.clickSignin();
		//testContextSetup.driver.findElement(By.xpath("//button[@id='signInBtn']")).click();
	}
	
	
	


}
