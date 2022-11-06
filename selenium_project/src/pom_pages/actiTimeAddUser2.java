package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeAddUser2 {
	@FindBy(xpath = "(//input[@name='firstName'])[2]")
	private WebElement tbFirstNmae;

	@FindBy(xpath = "(//input[@name='lastName'])[2]")
	private WebElement tbLastName;

	@FindBy(xpath = "(//input[@name='email'])[2]")
	private WebElement tbEmail;

	@FindBy(xpath = "//div[text()='Save & Send Invitation']")
	private WebElement btnSave;

	public actiTimeAddUser2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addUser(String fn,String ln,String mail)
	{
		this.tbFirstNmae.sendKeys(fn);
		this.tbLastName.sendKeys(ln);
		this.tbEmail.sendKeys(mail);
		this.btnSave.click();
		
	}

}
