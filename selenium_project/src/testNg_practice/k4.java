package testNg_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class k4 {
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void BeforeMethod(String browser) {
		if (browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void Script()
	{
		driver.get("https://www.udemy.com");
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("From before suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("From after suite");
	}
	@Parameters("browser")
	@BeforeTest
	public void beforetest(String browser)
	{
		System.out.println("running from "+browser);
	}
	@Parameters("browser")
	@AfterTest
	public void afterTest(String browser)
	{
		System.out.println("Execution compleeted in "+browser);
	}
}
