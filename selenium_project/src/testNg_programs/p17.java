package testNg_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p17 {
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
				//identifies the checkbox
				WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
				//validates wheather checkbox is selected or not
				Assert.assertTrue(cb.isSelected());
				
	}
}
