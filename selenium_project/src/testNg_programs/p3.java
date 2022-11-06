package testNg_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p3 {
	@Test
	public void fbLoginScripts()
	{
		// set the path for chromedriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// launches the chrome browser
				WebDriver driver = new ChromeDriver();
				// fetches the webpage
				driver.get("https://www.facebook.com");
				// maximize the window
				driver.manage().window().maximize();
				// identify the username
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
				// identify the login button
				driver.findElement(By.xpath("//button[@name='login']")).click();
				
				driver.quit();

	}
	@Test
	public void actiLoginScript()
	{
		// set the path for chromedriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// launches the chrome browser
				WebDriver driver = new ChromeDriver();
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
}
