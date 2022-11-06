import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p11 {
	WebDriver driver;

	@Parameters("browser")
	@Test
	public void actiLoginScript(String bn) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// set the path for chromedriver.exe
		if (bn.equals("chrome")) {
			driver = new ChromeDriver();
		}
		// launches the firefox browser
		else if (bn.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// fetches the webpage
		driver.get("https://demo.actitime.com/login.do");
		// maximize the window
		driver.manage().window().maximize();
		// identify the username and enters the username
		driver.findElement(By.name("username")).sendKeys("admin");
		// identify thw password and enters the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// identify the login button and clicks on it
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
	}

	@Parameters("browser")
	@BeforeTest
	public void beforetest(String bn) {
		System.out.println("begining of the execution in " + bn);
	}

	@Parameters("browser")
	@AfterTest
	public void aftertest(String bn) {
		System.out.println("after the execution of " + bn);
	}
}
