package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeLogin2 {
	// identifies username
	@FindBy(name = "username")
	private WebElement tbUsername;
	// identifies password
	@FindBy(name = "pwd")
	private WebElement tbPassword;
	// identifies loginButton
	@FindBy(id = "loginButton")
	private WebElement btnLogin;

	// initialises the webelements (non static variable) in the object
	public actiTimeLogin2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un,String pw)
	{
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();
	}

}
