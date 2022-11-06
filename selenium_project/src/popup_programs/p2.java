package popup_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p2 {
	public static void main(String[] args) throws InterruptedException {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// add wait timings

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/vishnu/Desktop/alert.html");

		driver.manage().window().maximize();
		// enters the username

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		Alert a = driver.switchTo().alert();

		wait.until(ExpectedConditions.alertIsPresent());

		a.accept();

	}
}
