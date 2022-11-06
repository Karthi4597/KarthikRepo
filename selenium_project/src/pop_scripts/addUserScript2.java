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

public class addUserScript2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		
		actiTimeLogin2 ob1=new actiTimeLogin2(driver);
		ob1.login("admin", "manager");
		
		actiTimeEnteTimeTrack2 ob2=new actiTimeEnteTimeTrack2(driver);
		ob2.users();
		
		actiTimeUserList2 ob3=new actiTimeUserList2(driver);
		ob3.newUser();
		
		Thread.sleep(3000);
		
		actiTimeAddUser2 ob4=new actiTimeAddUser2(driver);
		ob4.addUser("kar", "karthik", "kar123@gmail.com");
		
		
		

	}

}
