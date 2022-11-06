package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class k5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		driver.findElement(By.id("followall")).click();
		driver.manage().window().maximize();

		Set<String> allWindows = driver.getWindowHandles();

		for (String lv : allWindows) {
			driver.switchTo().window(lv);
			String title = driver.getTitle();
			if (title.contains("Facebook")) {
				driver.close();
			}
		}
	}
}
