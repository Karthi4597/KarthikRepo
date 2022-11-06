package testNg_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class k1 {
	WebDriver driver;
@BeforeMethod
public void BeforeMethod()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@AfterMethod
public void AfterMethod()
{
	//driver.close();
}

@Test
public void FlipkartScript()
{
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("nike ladies shoes");
	driver.findElement(By.xpath("(//div[@class='_28p97w'])[1]")).click();

	
}
}
