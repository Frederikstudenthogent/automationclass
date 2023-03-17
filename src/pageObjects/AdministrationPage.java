package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdministrationPage {
	
	@FindBy(how = How.XPATH, using = "//label[.='reset users']")
	private WebElement resetUsers;	
	
	@FindBy(how = How.ID, using = "new_username")
	private WebElement fldNewUsername;	
	
	@FindBy(how = How.ID, using = "new_password")
	private WebElement fldNewPassword;
	
	@FindBy(how = How.XPATH, using = "//span[.='create']")
	private WebElement btnCreate;
	
	public void clickResetButton()
	{
		resetUsers.click();
	}
	
	public void createNewUser ()
	{
	fldNewUsername.sendKeys("Frederik");
	fldNewPassword.sendKeys("Password");
	btnCreate.click();
	
	}

}
