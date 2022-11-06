package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));

		System.out.println(cb.isSelected());

		cb.click();
		System.out.println(cb.isSelected());

	}
}
