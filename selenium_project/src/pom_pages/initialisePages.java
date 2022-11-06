package pom_pages;

import org.openqa.selenium.WebDriver;

public class initialisePages {

	public actiTimeLogin2 actiLogin;
	public actiTimeEnteTimeTrack2 actiTimeTrack;
	public actiTimeUserList2 actiUserList;
	public actiTimeAddUser2 actiAddUser;
	
	public initialisePages(WebDriver driver)
	{
		this.actiLogin=new actiTimeLogin2(driver);
		this.actiTimeTrack=new actiTimeEnteTimeTrack2(driver);
		this.actiUserList=new actiTimeUserList2(driver);
		this.actiAddUser=new actiTimeAddUser2(driver);
	}
}
