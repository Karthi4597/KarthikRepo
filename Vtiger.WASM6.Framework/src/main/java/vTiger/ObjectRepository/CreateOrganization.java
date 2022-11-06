package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization {
@FindBy(name="accountname")
private WebElement tbOrgName;

@FindBy(xpath="//input[@name='website']")
private WebElement tbWebsite;

@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
private WebElement btnSave;

public CreateOrganization(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void Organization(String ON,String emp)
{
	this.tbOrgName.sendKeys(ON);
	this.tbWebsite.sendKeys(emp);
	this.btnSave.click();
}

}
