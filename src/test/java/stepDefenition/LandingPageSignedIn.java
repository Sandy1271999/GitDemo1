package stepDefenition;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.POLandingPageSignedIn;
import PageObjects.POSigninPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSignedIn {
	
	TestContextSetup testContextSetup;
	public POLandingPageSignedIn validatesignin;
	
	public LandingPageSignedIn(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	
	@Then("^Signed in version of home page is displayed$")
	public void Signed_In_Version_Of_Home_Page()
	{
		POLandingPageSignedIn validatesignin = testContextSetup.pageObjectManager.ValidateSignin();
		validatesignin.validateMyAccIcon();
		//Assert.assertTrue(testContextSetup.driver.findElement(By.id("id_person_icon")).isDisplayed());
		
	}
	

}
