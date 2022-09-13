package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.TestContextSetup;

public class POLandingPageSignedIn {
	
	TestContextSetup testContextSetup;
	public WebDriver driver;
	
	public POLandingPageSignedIn(WebDriver driver) {
		this.driver = driver;
	}

	By myAccount = By.id("id_person_icon");
	public void validateMyAccIcon() 
	{
		Assert.assertTrue(driver.findElement(myAccount).isDisplayed());
	}

}
