package testNg_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p4 {
	WebDriver driver; 
	@BeforeMethod
	public void precondition()
	{
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		driver = new ChromeDriver();
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
	public void fbLoginScripts()
	{
				// fetches the webpage
				driver.get("https://www.facebook.com");
				// identify the username
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
				//identify the passwords
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
				// identify the login button
				driver.findElement(By.xpath("//button[@name='login']")).click();
				
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
