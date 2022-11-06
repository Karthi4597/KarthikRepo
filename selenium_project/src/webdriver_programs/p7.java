package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program to close all the windows one after the other
public class p7 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// fetches the webpage
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		// maximize the window
		driver.manage().window().maximize();
		// finds and clicks on followall
		driver.findElement(By.id("followall")).click();
		// returns the unique reference of the main window
		String mainWindow = driver.getWindowHandle();

		// returns the unique reference of all the windows
		Set<String> allWindows = driver.getWindowHandles();

		for (String lv : allWindows) {
			driver.switchTo().window(lv);
			driver.close();
			Thread.sleep(3000);
		}
	}
}
