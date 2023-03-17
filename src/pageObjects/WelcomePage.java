package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WelcomePage {
	
	@FindBy(how = How.ID, using = "welcome")
	private WebElement fldWelcomeMessage;	
	
	public String getWelcomeMessage()
	{
		return fldWelcomeMessage.getText();
	}
	
	

}
