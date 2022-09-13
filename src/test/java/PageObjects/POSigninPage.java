package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;

public class POSigninPage {
	TestContextSetup testContextSetup;
	public WebDriver driver;
	public POSigninPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By usernameElement = By.xpath("//input[@id='signin_form_username']");
	By passwordElement = By.xpath("//input[@id='signin_form_password']");
	By signinBtn = By.xpath("//button[@id='signInBtn']");
	By signInLink = By.xpath("//strong[@title='Sign In']");
	public void enterCredentials(String userName, String password)
	{
		driver.findElement(usernameElement).sendKeys(userName);
		driver.findElement(passwordElement).sendKeys(password);
	}
	
	public void clickSignin()
	{
		driver.findElement(signinBtn).click();
	}
	
	public void signinNavigate()
	{
		driver.findElement(signInLink).click();
	}
	
	
}
