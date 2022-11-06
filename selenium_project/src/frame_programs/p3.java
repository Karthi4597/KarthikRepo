package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// fetches the webpage
		driver.get("file:///C:/Users/vishnu/Desktop/page2.html");
		// identify the t2 and enters the data
		driver.findElement(By.id("t2")).sendKeys("java");

		// switches the control to inner frame
		driver.switchTo().frame(0);
		// pauses the execution for 3 sec
		Thread.sleep(3000);
		// identifies the t2 and enters the data
		driver.findElement(By.id("t1")).sendKeys("automationTesting");
		// control comes back to main page
		driver.switchTo().defaultContent();
		// pauses the execution for 3 sec
		Thread.sleep(3000);
		// identify the webelement and clears the data
		driver.findElement(By.id("t2")).clear();
	}
}
