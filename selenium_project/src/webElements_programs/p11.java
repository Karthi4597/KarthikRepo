package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));

		System.out.println(cb.getAttribute("type"));

		System.out.println(cb.getAttribute("title"));

	}

}
