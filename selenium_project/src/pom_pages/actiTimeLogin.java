package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeLogin {
	// identifies username
	@FindBy(name = "username")
	public WebElement tbUsername;
	// identifies password
	@FindBy(name = "pwd")
	public WebElement tbPassword;
	// identifies loginButton
	@FindBy(id = "loginButton")
	public WebElement btnLogin;

	// initialises the webelements (non static variable) in the object
	public actiTimeLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
