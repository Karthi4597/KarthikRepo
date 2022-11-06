package webdriver_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		// maximise the windows
		// driver.manage().window().maximize();
		// minimise the windows
		// driver.manage().window().minimize();
		// fullscreens the window
		// driver.manage().window().fullscreen();
		// get the page source of the webpage
		String ps = driver.getPageSource();
		System.out.println(ps);

	}
}
