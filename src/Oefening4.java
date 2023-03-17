import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Oefening4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fvanacker\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://satrngselcypr.z16.web.core.windows.net/");
		
		WebElement logoutButton = driver.findElement(By.xpath("//a[@id='logout']"));
		logoutButton.click();
		
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("superduper");
		
		waitFor();
		
		driver.findElement(By.className("content")).click();
		
		
		
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
