package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.genericLibrary.WebDriverLibrary;

public class HomePage
{
@FindBy(linkText="Organizations")
private WebElement lnkOrganization;

@FindBy(linkText="Contacts")
private WebElement lnkContacts;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement lgLogout;

@FindBy(linkText="Sign Out")
private WebElement btnSignOut;

public HomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void ClickOnContactsLink()
{
	this.lnkContacts.click();
}

public void ClickOnOrgaLink() {
	this.lnkOrganization.click();
	
}

public void logout(WebDriver driver) throws InterruptedException
{
	WebDriverLibrary wLib=new WebDriverLibrary();
	Thread.sleep(5000);
	wLib.waitsForElementToBeVisible(driver, lgLogout);

	wLib.mouseOverON(driver, lgLogout);
	
	
	
	this.btnSignOut.click();
	
}





}
