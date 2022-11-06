package popup_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//notification and geo location popups
public class p9 {
	public static void main(String[] args) throws Exception {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// creates an object of chromeoptions
		ChromeOptions options = new ChromeOptions();
		// disables the notifications
		options.addArguments("--disable-notifications");
		// disables geolocations
		options.addArguments("--disable-geolocation");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver(options);
		// maximize the window
		driver.manage().window().maximize();
		// fetches the webpage
		driver.get("https://www.hdfcbank.com");

	}
}
