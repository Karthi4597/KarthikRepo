package testNg_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class actiLogin extends baseTest1
{
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
