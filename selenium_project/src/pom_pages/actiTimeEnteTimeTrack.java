package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeEnteTimeTrack {
	// identifies task
	@FindBy(xpath = "//a[@class='content tasks']")
	public WebElement lnkTask;
	// identifies reportsButton
	@FindBy(xpath = "//a[@class='content reports']")
	public WebElement lnkReports;
	// identifies user
	@FindBy(xpath = "//a[@class='content users']")
	public WebElement lnkUsers;
	// identifies login button
	@FindBy(id = "logoutLink")
	public WebElement btnLogout;

	// initialises the webelements (non static variable) in the object
	public actiTimeEnteTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
