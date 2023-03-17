import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.WelcomePage;
import frameworkPackage.DriverManager;
import frameworkPackage.TrainingListener;

public class Oefening9 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {			
		
		DriverManager.getDriver().get("https://satrngselcypr.z16.web.core.windows.net/");	
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(DriverManager.getDriver());
		edriver.register(new TrainingListener());	
				
		MenuPage menu = new MenuPage();
		LoginPage login = new LoginPage();	
		WelcomePage welcome = new WelcomePage();
		
		PageFactory.initElements(edriver, menu);
		PageFactory.initElements(edriver, login);
		PageFactory.initElements(edriver, welcome);
		
		menu.clickLogout();
		//login.noFieldClick();
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
