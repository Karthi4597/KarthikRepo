package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeUserList {

	@FindBy(xpath = "//div[text()='New User']")
	public WebElement btnNewUser;

	public actiTimeUserList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
