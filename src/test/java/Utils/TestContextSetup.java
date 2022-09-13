package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBaseClass testbaseclass;
	public ImpcitWait impWait;
	public TestContextSetup() throws IOException
	{
		testbaseclass = new TestBaseClass();
		pageObjectManager = new PageObjectManager(testbaseclass.WebDriverManager());
		impWait = new ImpcitWait(testbaseclass.WebDriverManager());
	}
}
