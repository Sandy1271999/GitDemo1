package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;

public class POLandingPageGuestUser {

	
	public WebDriver driver;
	String Url= "https://i2a.hcqa.deloitte.com/";
	public POLandingPageGuestUser(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By cookieDecline = By.id("onetrust-reject-all-handler");
	By signinLink = By.xpath("//strong[@title='Sign In']");
	 public void CookieDecline()
	 {
		 driver.findElement(cookieDecline).click();
	 }
	 
	 public void HitLandingPage()
	 {
		 driver.get(Url);
	 }

}
