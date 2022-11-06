package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6 {

	public static void main(String[] args) {
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

	}

}
