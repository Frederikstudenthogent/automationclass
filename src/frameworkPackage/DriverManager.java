package frameworkPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	private static WebDriver driver ;
	
	public static WebDriver getDriver()
	{
	if (driver == null)	
	{
		setChromeDriver();
	}
	
	return driver;
	}
	
	public static void setChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fvanacker\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximaliseer de size van je browser. extra functie
	}
	
	public static void killDriver()
	{
		if (driver != null)
		{
			driver.quit();
			driver = null;
		}
	}

}
