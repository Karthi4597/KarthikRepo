package pop_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_pages.actiTimeLogin;

public class loginscripts {
	public static void main(String[] args) throws InterruptedException {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// defines implisitly waits for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// fetches the webpage
		driver.get("https://demo.actitime.com/login.do");
		// maximises the window
		driver.manage().window().maximize();

		// creates an object of actiTimeLogin_page pom class
		actiTimeLogin obj = new actiTimeLogin(driver);
		// enters username
		obj.tbUsername.sendKeys("admin");
		// enters password
		obj.tbPassword.sendKeys("manager");
		// clicks on login button
		obj.btnLogin.click();
	}
}
