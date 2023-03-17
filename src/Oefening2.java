import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oefening2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\fvanacker\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println("The title is " + driver.getTitle());
		
		driver.get("http://www.google.com");
		System.out.println("Navigate to google, get title: " + driver.getTitle());
		System.out.println("Print current url: " + driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals("https://www.google.com/")) {
		System.out.println("Correct google url.");
		}
		else {
		System.out.println("Not the correct url");
		}
		if (driver.getPageSource().contains("footer")) {
		System.out.println("Correct pagesource.");
		}
		else {
		System.out.println("Not the correct pagesource");
		}
		 
		driver.navigate().to("https://www.bing.com");
		System.out.println("Navigate to bing, get title: " + driver.getTitle());
		System.out.println("Print current url: " + driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals("https://www.bing.com/")) {
		System.out.println("Correct bing url.");
		}
		else {
		System.out.println("Not the correct url");
		}
		if (driver.getPageSource().contains("sb_admin")) {
		System.out.println("Pagesource should not contain");
		}
		else {
		System.out.println("Pagesource does not contain ");
		}
		 
		driver.navigate().back();
		System.out.println("Navigate back, get title: " + driver.getTitle());
		System.out.println("Print current url: " + driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals("https://www.google.com/")) {
		System.out.println("Correct google back url.");
		}
		else {
		System.out.println("Not the correct url");
		}
		 
		driver.navigate().refresh();
		System.out.println("Refresh, get title: " + driver.getTitle());
		System.out.println("Print current url: " + driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals("https://www.google.com/")) {
		System.out.println("Correct google refresh url.");
		}
		else {
		System.out.println("Not the correct url");
		}
		 
		driver.quit();
		}
		 
		



	}


