package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeEnteTimeTrack2 {
	// identifies task
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement lnkTask;
	// identifies reportsButton
	@FindBy(xpath = "//a[@class='content reports']")
	private WebElement lnkReports;
	// identifies user
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement lnkUsers;
	// identifies login button
	@FindBy(id = "logoutLink")
	private WebElement btnLogout;

	// initialises the webelements (non static variable) in the object
	public actiTimeEnteTimeTrack2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void task()
	{
		this.lnkTask.click();
	}
	public void reports()
	{
		this.lnkTask.click();
	}
	public void users()
	{
		this.lnkUsers.click();
	}
	public void logout()
	{
		this.btnLogout.click();
	}
}
