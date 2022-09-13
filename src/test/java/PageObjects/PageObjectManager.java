package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public POLandingPageGuestUser landingpageGu;
	public POSigninPage signinPageGU;
	public POLandingPageSignedIn validatesignin;
	public WebDriver driver;
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	public POLandingPageGuestUser GetLandingPageGU()
	{
		landingpageGu = new POLandingPageGuestUser(driver);
		return landingpageGu;
	}
	
	public POSigninPage GetSigninPage()
	{
		signinPageGU = new POSigninPage(driver);
		return signinPageGU;
	}
	
	public POLandingPageSignedIn ValidateSignin()
	{
		validatesignin = new POLandingPageSignedIn(driver);
		return validatesignin;
	}

}
