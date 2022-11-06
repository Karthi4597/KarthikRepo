package testNg_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p10 {
	WebDriver driver; 
	@Parameters("browser")
	@BeforeMethod
	public void precondition(String bn)
	{
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// set the path for geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// launches the chrome browser
		if(bn.equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		// launches the firefox browser
		else if(bn.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		// maximize the window
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void postcondition()
	{
		//closes the browser
		driver.quit();

	}
	
	@Test
	public void actiLoginScript()
	{
				// fetches the webpage
				driver.get("https://demo.actitime.com/login.do");
				// identify the username and enters the username
				driver.findElement(By.name("username")).sendKeys("admin");
				// identify thw password and enters the password
				driver.findElement(By.name("pwd")).sendKeys("manager");
				// identify the login button and clicks on it
				driver.findElement(By.id("loginButton")).click();
	}
}
