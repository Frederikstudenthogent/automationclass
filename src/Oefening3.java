import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement; 

public class Oefening3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\fvanacker\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://satrngselcypr.z16.web.core.windows.net/");
		
		WebElement logoutButton = driver.findElement(By.id("logout"));
		logoutButton.click();
		
		WebElement selectLanguage = driver.findElement(By.name("language"));
		Select language = new Select(selectLanguage);
		language.selectByVisibleText("French");
		
		waitFor();
		
		WebElement username = driver.findElement(By.id("username"));		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("superduper");
		
		WebElement loginButton = driver.findElement(By.tagName("label"));
		loginButton.click();
		
		driver.findElement(By.linkText("New")).click();
		WebElement fldTel = driver.findElement(By.id("telephone"));
		fldTel.click();
		driver.findElement(By.id("telephone")).sendKeys("0486471093");
		
	}
	
	public static void waitFor()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
