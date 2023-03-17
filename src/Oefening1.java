import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oefening1 {

	public static void main(String[] args) {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fvanacker\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println("The title is " + driver.getTitle());
		
		
		
		
	}

}
