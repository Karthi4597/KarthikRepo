package select_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//program for selecting date of birth
public class p6 {
	public static void main(String[] args) {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// define implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximize the window
		driver.manage().window().maximize();
		// fetches the webpage
		driver.get("https://www.facebook.com/");
		// clicks on new account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		// identifies day dropdown
		WebElement day = driver.findElement(By.id("day"));
		// handles day dropdown
		Select s1 = new Select(day);
		s1.selectByValue("4");
		// identifies month dropdown
		WebElement month = driver.findElement(By.id("month"));
		// handels month dropdown
		Select s2 = new Select(month);
		s2.selectByValue("5");
		// identifies year dropdown
		WebElement year = driver.findElement(By.id("year"));
		// handels year dropdown
		Select s3 = new Select(year);
		s3.selectByValue("1997");
	}
}
