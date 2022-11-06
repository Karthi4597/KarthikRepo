package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class a1 {
	public static void main(String[] args) throws InterruptedException {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// fetches the webpage
		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.xpath("//a[@class='content users']")).click();

		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.
//				xpath("//input[@id='createUserPanel_firstNameField']")));

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("karthik");

		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("S");

		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("kar@gmail.com");

		driver.findElement(By.className("components_button submitBtn")).click();
	}
}
