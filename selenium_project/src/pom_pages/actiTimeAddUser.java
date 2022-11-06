package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeAddUser {
	@FindBy(xpath = "(//input[@name='firstName'])[2]")
	public WebElement tbFirstNmae;

	@FindBy(xpath = "(//input[@name='lastName'])[2]")
	public WebElement tbLastName;

	@FindBy(xpath = "(//input[@name='email'])[2]")
	public WebElement tbEmail;

	@FindBy(xpath = "//div[text()='Save & Send Invitation']")
	public WebElement btnSave;

	public actiTimeAddUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
