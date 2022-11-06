package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class k1 {

	public static void main(String[] args) throws InterruptedException {
		// set the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome drive
		WebDriver driver = new ChromeDriver();
		// opens the link
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		driver.manage().window().maximize();
		driver.findElement(By.id("followall")).click();
		multipleWidows(driver);
	}

	public static void multipleWidows(WebDriver driver) throws InterruptedException {
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		for (String lv : allWindows) {
			driver.switchTo().window(lv);
			if (lv.equals(mainWindow)) {
				driver.close();
			}
			Thread.sleep(3000);
		}
	}
}
