package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	@FindBy(how = How.ID, using = "username")
	private WebElement fldUsername;	
	
	@FindBy(how = How.ID, using = "password")
	private WebElement fldPassword;
	
	@FindBy(how = How.CLASS_NAME, using = "content")
	private WebElement btnLogin;
	
	@FindBy(how = How.NAME, using = "language")
	private WebElement dropdownLanguage;
	
	@FindBy(how = How.ID, using = "errors")
	private WebElement errorMessage;
	
	@FindBy(how = How.ID, using = "noField")
	private WebElement noField;	
	
	
	
	
	public void noFieldClick()
	{
		noField.click();
	}
	
	public void login (String username, String password)
	{
	fldUsername.sendKeys(username);
	fldPassword.sendKeys(password);
	btnLogin.click();
	
	}
	
	public void setLanguage (String language)
	{
		Select selectLanguage = new Select(dropdownLanguage);
		selectLanguage.selectByVisibleText(language);
	}
	
	public String getErrorMessage()
	{
		
		return errorMessage.getText(); 
	}
	
	public void loginAsAdmin() 
	{
		login ("admin", "superduper");
	}
	
	
	
}
