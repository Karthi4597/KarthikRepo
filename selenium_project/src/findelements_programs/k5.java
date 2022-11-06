package findelements_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class k5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	List<WebElement> suggetions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	
	for(WebElement lv:suggetions)
	{
		System.out.println(lv);
	}
	driver.close();
}
}
