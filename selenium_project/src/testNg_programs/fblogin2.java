package testNg_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class fblogin2 extends baseTest2 {
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

}
