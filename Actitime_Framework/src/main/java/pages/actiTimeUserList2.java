package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeUserList2 {

	@FindBy(xpath = "//div[text()='New User']")
	private WebElement btnNewUser;

	public actiTimeUserList2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void newUser()
	{
		this.btnNewUser.click();
	}
}
