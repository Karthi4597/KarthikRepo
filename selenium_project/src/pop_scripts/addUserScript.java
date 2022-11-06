package pop_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_pages.actiTimeAddUser;
import pom_pages.actiTimeEnteTimeTrack;
import pom_pages.actiTimeLogin;
import pom_pages.actiTimeUserList;

public class addUserScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		actiTimeLogin ob1 = new actiTimeLogin(driver);
		ob1.tbUsername.sendKeys("admin");
		ob1.tbPassword.sendKeys("manager");
		ob1.btnLogin.click();

		actiTimeEnteTimeTrack ob2 = new actiTimeEnteTimeTrack(driver);
		ob2.lnkUsers.click();

		actiTimeUserList ob3 = new actiTimeUserList(driver);
		ob3.btnNewUser.click();

		Thread.sleep(3000);

		actiTimeAddUser ob4 = new actiTimeAddUser(driver);
		ob4.tbFirstNmae.sendKeys("karthik");
		ob4.tbLastName.sendKeys("s");
		ob4.tbEmail.sendKeys("kar123@gmail.com");
		ob4.btnSave.click();

	}

}
