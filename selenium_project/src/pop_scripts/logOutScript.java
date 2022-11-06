package pop_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_pages.actiTimeEnteTimeTrack;
import pom_pages.actiTimeLogin;

public class logOutScript {
	public static void main(String[] args) {
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
		ob2.btnLogout.click();

	}
}
