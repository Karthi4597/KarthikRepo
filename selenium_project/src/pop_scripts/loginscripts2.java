package pop_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_pages.actiTimeLogin2;

public class loginscripts2 {
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
		actiTimeLogin2 obj = new actiTimeLogin2(driver);
		obj.login("admin","manager");
	}
}
