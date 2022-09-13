package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImpcitWait {
	
	public ImpcitWait impWait;
	public WebDriver driver;
	public ImpcitWait(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
