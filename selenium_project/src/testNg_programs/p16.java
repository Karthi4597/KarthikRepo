package testNg_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p16 {
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
				
				WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
				
//				Assert.assertEquals(link.isDisplayed(), false);
				Assert.assertTrue(link.isDisplayed());
				
	}
}
