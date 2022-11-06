package testNg_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_pages.initialisePages;

public class p14 {
@Test(dataProviderClass=dPClass.class,dataProvider="adduserdata")
public void adduserscript(String un,String pw,String fn,String ln,String em) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.manage().window().maximize();

	driver.get("https://demo.actitime.com/login.do");
	
	initialisePages pages=new initialisePages(driver);
	pages.actiLogin.login(un,pw);
	pages.actiTimeTrack.users();
	pages.actiUserList.newUser();
	Thread.sleep(3000);
	pages.actiAddUser.addUser(fn,ln,em);

}
}
