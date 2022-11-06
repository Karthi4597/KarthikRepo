package javascript_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// opens the actitime application
		driver.get("https://www.actitime.com/");

		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("window.scrollBy(0,6000)");
	}

}
