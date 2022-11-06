package synchronisation_programs;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

//program for fluent wait
public class p7 {
	public static void main(String[] args) {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// fetches the webpage
		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();

		FluentWait wait = new FluentWait(driver);
		// customises the polling period
		wait.pollingEvery(Duration.ofMillis(250));
		// customises the timeout period
		wait.withTimeout(Duration.ofSeconds(30));
		// ignores the exception
		wait.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='content users']")));

		driver.findElement(By.xpath("//a[@class='content users']")).click();

	}

}
