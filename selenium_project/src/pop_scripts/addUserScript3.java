package pop_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_pages.actiTimeAddUser;
import pom_pages.actiTimeAddUser2;
import pom_pages.actiTimeEnteTimeTrack;
import pom_pages.actiTimeEnteTimeTrack2;
import pom_pages.actiTimeLogin;
import pom_pages.actiTimeLogin2;
import pom_pages.actiTimeUserList;
import pom_pages.actiTimeUserList2;
import pom_pages.initialisePages;

public class addUserScript3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		
		initialisePages pages=new initialisePages(driver);
		pages.actiLogin.login("admin", "manager");
		pages.actiTimeTrack.users();
		pages.actiUserList.newUser();
		Thread.sleep(3000);
		pages.actiAddUser.addUser("abc", "z", "abc123@gmai.com");
		
			}

}
