package webdriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.navigate().to("https://www.flipkart.com");

		// driver.navigate().back();

		// driver.navigate().forward();

		// driver.navigate().refresh();
	}

}
