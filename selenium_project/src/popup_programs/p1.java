package popup_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p1 {
	public static void main(String[] args) throws InterruptedException {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// add wait timings
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// fetches the webpage
		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();
		// enters the username
		driver.findElement(By.id("username")).sendKeys("admin");
		// enters the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// clicks on login button
		driver.findElement(By.id("loginButton")).click();
		// clicks on users button
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		// clicks on new users
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();

		Thread.sleep(2000);
		// enters the first name
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("karthik");
		// clicks on close button
		driver.findElement(By.xpath("//div[contains(@class,'closeButton hide')]")).click();
		// creates the object of webdriver wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// waits for java script popup
		wait.until(ExpectedConditions.alertIsPresent());
		// switches the controll to popup
		Alert a = driver.switchTo().alert();
		// retrive the text from the popup
		String text = a.getText();
		System.out.println(text);
		// clicks on ok button
		// a.accept();
		// clicks on cancle button
		a.dismiss();
	}
}
