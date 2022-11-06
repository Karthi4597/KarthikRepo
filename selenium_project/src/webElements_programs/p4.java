package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	public static void main(String[] args) {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// fetches the webpage
		driver.get("https://demo.actitime.com/login.do");
		// maximize the window
		driver.manage().window().maximize();
		// identify the username and enters the username
		driver.findElement(By.name("username")).sendKeys("admin");
		// identify thw password and enters the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// identify the login button and clicks on it
		driver.findElement(By.id("loginButton")).click();

	} 

}
