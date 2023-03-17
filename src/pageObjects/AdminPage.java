package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {
	
	@FindBy(how = How.LINK_TEXT, using = "https://satrngselcypr.z16.web.core.windows.net/admin.html")
	private WebElement adminButton;	
	
	@FindBy(how = How.ID, using = "logout")
	private WebElement btnLogout;
	
	public void clickButton()
	{
		adminButton.click();
	}
	
	public void clickLogoutButton()
	{
		btnLogout.click();
	}

}
