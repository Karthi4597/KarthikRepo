package testNg_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class p18 {
	@Test
	public void actiLoginScript() throws InterruptedException
	{
		// set the path for chromedriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// launches the chrome browser
				WebDriver driver = new ChromeDriver();
				// fetches the webpage
				driver.get("https://demo.actitime.com/login.do");
				// maximize the window
				driver.manage().window().maximize();
				//identify the web element
				WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
				//creates an object of assert class
				SoftAssert s=new SoftAssert();
				//validates wheather the link is displayed or not
				s.assertFalse(link.isDisplayed());
				// identify the username and enters the username
				driver.findElement(By.name("username")).sendKeys("admin");
				// identify thw password and enters the password
				driver.findElement(By.name("pwd")).sendKeys("manager");
				// identify the login button and clicks on it
				driver.findElement(By.id("loginButton")).click();
				
				s.assertAll();
				
	}
}
