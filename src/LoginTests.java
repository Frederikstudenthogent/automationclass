import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

import frameworkPackage.DriverManager;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.WelcomePage;

public class LoginTests 
{
	static MenuPage menu = new MenuPage();
	static LoginPage login = new LoginPage();	
	static WelcomePage welcome = new WelcomePage();

	@BeforeAll
	public static void setup()
	{
		DriverManager.getDriver().get("https://satrngselcypr.z16.web.core.windows.net/");
		PageFactory.initElements(DriverManager.getDriver(), menu);
		PageFactory.initElements(DriverManager.getDriver(), login);
		PageFactory.initElements(DriverManager.getDriver(), welcome);
	}
	
	@BeforeEach
	public void openLoginPage()
	{
		menu.clickLogout();
	}
	
	@Test
	public void tc_LoginWithCorrectUsernameAndPassword()
	{
		login.login("admin", "superduper");
		Assert.assertTrue(welcome.getWelcomeMessage().contains("Welcome"));
	}

	@Test
	public void tc_LoginWithCorrectUsernameAndIncorrectPassword()
	{
		login.login("admin", "foutpassword");
		Assert.assertFalse(welcome.getWelcomeMessage().contains("Welcome"));
	}
	
	@Test
	public void tc_LoginWithIncorrectUsername()
	{
		login.login("bdmin", "foutpassword");
		Assert.assertFalse(welcome.getWelcomeMessage().contains("Welcome"));
	}
	
	@ParameterizedTest
	@CsvSource({
		"admin, sdsmfkjqf"
	})
	
	void testWithStringParameterCSV(String login, String password)
	{
		
	}
	
	


	
}
