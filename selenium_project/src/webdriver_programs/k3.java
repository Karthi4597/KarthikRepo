package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class k3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("actiTIME Inc.")).click();

		multipleTabs(driver);
	}

	public static void multipleTabs(WebDriver driver) {
		String mainTab = driver.getWindowHandle();

		Set<String> allTabs = driver.getWindowHandles();

		for (String lv : allTabs) {
			driver.switchTo().window(lv);
			if (lv.equals(mainTab)) {
				driver.close();
			}
		}
	}
}