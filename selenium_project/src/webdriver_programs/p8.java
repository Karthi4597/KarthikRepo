package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {

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

		// calls the static method
		multipleWindows(driver);
	}

	public static void multipleWindows(WebDriver driver) throws InterruptedException

	{
		// returns the unique reference of the main window
		String mainWindow = driver.getWindowHandle();

		// returns the unique reference of all the windows
		Set<String> allWindows = driver.getWindowHandles();
		for (String lv : allWindows) {
			// switches the control to the specified window
			driver.switchTo().window(lv);
			if (!lv.equals(mainWindow)) {
				// closes the window
				driver.close();
			}
			// pauses the program for 2sec
			Thread.sleep(3000);
		}
	}
}
