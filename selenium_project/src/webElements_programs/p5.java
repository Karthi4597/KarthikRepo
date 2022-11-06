package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");

		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");

		driver.findElement(By.cssSelector("a[id='loginButton']")).click();

		driver.navigate().to("https:www.flipkart.com");

	}

}
