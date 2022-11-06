package popup_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	public static void main(String[] args) throws InterruptedException {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// add wait timings

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.icicibank.com");

//			
//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//			
//			wait.until(ExpectedConditions.alertIsPresent());
		

		driver.findElement(By.id("push-modal-close")).click();

//			Alert a = driver.switchTo().alert();
//			
//			a.accept();

	}
}
