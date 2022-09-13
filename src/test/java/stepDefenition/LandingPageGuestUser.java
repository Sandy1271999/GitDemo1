package stepDefenition;

import java.util.concurrent.TimeUnit;
import Utils.TestContextSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.POLandingPageGuestUser;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageGuestUser {
	
	public WebDriver driver;
	PageObjectManager pageObjectManager;
	TestContextSetup testContextSetup;
	
	public LandingPageGuestUser(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}

	@Given("^Im in Landing page$")
	public void Im_an_in_Landing_page()
	{
		//POLandingPageGuestUser POlandingpageGU = pageObjectManager.GetLandingPageGU();
		POLandingPageGuestUser POlandingpageGU = testContextSetup.pageObjectManager.GetLandingPageGU();
		//POLandingPageGuestUser POlandingpageGU = new POLandingPageGuestUser(testContextSetup.driver);
		testContextSetup.impWait.Implicitwait();
		//testContextSetup.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		POlandingpageGU.HitLandingPage();
		POlandingpageGU.CookieDecline();
	
		//POSigninPage POsigninpage = testContextSetup.pageObjectManager.signinPageGU;
	}
	


}
