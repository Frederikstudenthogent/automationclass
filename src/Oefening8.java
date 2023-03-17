import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.WelcomePage;
import pageObjects.AdminPage;
import pageObjects.AdministrationPage;
import frameworkPackage.DriverManager;

public class Oefening8 {

	public static void main(String[] args) {
		DriverManager.getDriver().get("https://satrngselcypr.z16.web.core.windows.net/");	
		
		MenuPage menu = new MenuPage();
		LoginPage login = new LoginPage();	
		WelcomePage welcome = new WelcomePage();
		AdminPage admin = new AdminPage ();
		AdministrationPage administration = new AdministrationPage ();
		
		PageFactory.initElements(DriverManager.getDriver(), menu);
		PageFactory.initElements(DriverManager.getDriver(), login);
		PageFactory.initElements(DriverManager.getDriver(), welcome);
		PageFactory.initElements(DriverManager.getDriver(), admin);
		
		menu.clickLogout();
		
		login.login("admin", "superduper");
		
		admin.clickButton();
		
		String currentWindow = DriverManager.getDriver().getWindowHandle();	
		String newWindow = "";
		
		Set<String> allWindows = DriverManager.getDriver().getWindowHandles();
		for (String window : allWindows)
		{
			if (!currentWindow.equals(window))
			{
				newWindow = window;
				break;
			}
		}
		
		DriverManager.getDriver().switchTo().window(newWindow);
		
		administration.clickResetButton();
		
		Alert popup = DriverManager.getDriver().switchTo().alert();
		String textPopup = popup.getText();
		
		if (textPopup.equals(textPopup))
		{
			System.out.println("Text in popup is correct");
		}
		else
		{
			System.out.println("Text in popup is incorrect");
		}
		
		popup.accept();
		
		DriverManager.getDriver().close();
		
		DriverManager.getDriver().switchTo().window(currentWindow);
		
		administration.createNewUser();			
		
		admin.clickLogoutButton();
		
		login.login("Frederik", "Password");
		
		System.out.println("Test scenario ran without errors.");
		
	}

	
	public static void waitFor()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
