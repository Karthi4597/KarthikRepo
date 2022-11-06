package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6 {

	public static void main(String[] args) {
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
		System.out.println(mainWindow);
		// returns the unique reference of all the windows
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		// returns the name of the set
		System.out.println(allWindows.getClass().getName());
		// iterates the set
		for (String lv : allWindows) {
			System.out.println(lv);
		}

	}

}
