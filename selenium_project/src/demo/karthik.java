package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class karthik {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.manage().window().maximize();

	driver.get("https://demo.actitime.com/login.do");

	driver.findElement(By.id("username")).sendKeys("admin");

	driver.findElement(By.name("pwd")).sendKeys("manager");

	driver.findElement(By.id("loginButton")).click();

	driver.findElement(By.xpath("//a[@class='content users']")).click();

	driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();

	String user = driver.getWindowHandle();
	Set<String> links = driver.getWindowHandles();
	System.out.println(user);
	System.out.println(links);

	for (String lv : links) {
		if (lv.equals(user)) {
			driver.switchTo().window(lv);
			System.out.println(lv);
		}
	}
	
	Thread.sleep(3000);

	driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("karthik");

	driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("S");

	driver.findElement(By.id("createUserPanel_emailField")).sendKeys("kar@gmail.com");

	driver.findElement(By.xpath("//div[@class='components_button submitBtn']")).click();

}
}
