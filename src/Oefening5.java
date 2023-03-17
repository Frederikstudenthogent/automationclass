import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.WelcomePage;
import frameworkPackage.DriverManager;

public class Oefening5 {

	public static void main(String[] args) {			
		
		DriverManager.getDriver().get("https://satrngselcypr.z16.web.core.windows.net/");	
		
		MenuPage menu = new MenuPage();
		LoginPage login = new LoginPage();	
		WelcomePage welcome = new WelcomePage();
		
		PageFactory.initElements(DriverManager.getDriver(), menu);
		PageFactory.initElements(DriverManager.getDriver(), login);
		PageFactory.initElements(DriverManager.getDriver(), welcome);
		
		menu.clickLogout();
		login.setLanguage("French");
		login.login("admin", "superduper");
		
		String welcomeMessage = welcome.getWelcomeMessage();
		
		if (welcomeMessage.equals(welcomeMessage))
		{
			System.out.println("Welcome message is correct");
		}
		else
			System.out.println("Welcome message is not correct");
		
		DriverManager.killDriver();
		
		
			
		
		

	}

}
