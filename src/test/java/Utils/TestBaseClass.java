package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass {
	
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	{
		//FileInputStream FIS = new FileInputStream("C:\\Users\\saselvaraja\\eclipse-workspace\\Cucumber\\src\\test\\Resources\\GLobal.properties");
		//Properties prop = new Properties();
		//prop.load(FIS);
		//String url = prop.getProperty("urlQA");
		if(driver == null)
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saselvaraja\\Documents\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		return driver;
	}

}
