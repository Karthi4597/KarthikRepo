package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice 
{
@FindBy(name="user_name")
private WebElement tbUsername;

@FindBy(name="user_password")
private WebElement tbPassword;

@FindBy(id="submitButton")
private WebElement btnLogin;

public Practice(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void loginToApp(String UN,String PW)
{
	this.tbUsername.sendKeys(UN);
	this.tbPassword.sendKeys(PW);
	this.btnLogin.click();
}



}
