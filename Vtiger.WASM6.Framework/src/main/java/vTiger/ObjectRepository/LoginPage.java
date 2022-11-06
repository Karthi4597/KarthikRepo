package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="user_name")
private WebElement tbUsername;

@FindBy(name="user_password")
private WebElement tbPassword;

@FindBy(id="submitButton")
private WebElement btnLogin;

public LoginPage(WebDriver driver)
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
