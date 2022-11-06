package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

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
		WebElement username = driver.findElement(By.id("email"));
		// enters the username
		username.sendKeys("abcd");
		// identify the password
		WebElement password = driver.findElement(By.id("pass"));
		// enters the password
		password.sendKeys("1234");
		// identify the login button
		WebElement login = driver.findElement(By.name("login"));
		// click on login button
		login.click();

	}

}
