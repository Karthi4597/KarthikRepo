package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//program for explicitly wait

public class p6 {
	public static void main(String[] args) {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// fetches the webpage
		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();
		// waits for invisibility of login button
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loginButton")));
		// waits for visibility of users button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//a[@class='content users']\"")));

		driver.findElement(By.xpath("//a[@class='content users']")).click();

	}

}
