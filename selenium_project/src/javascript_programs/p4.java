package javascript_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// opens the actitime application
		driver.get("file:///C:/Users/vishnu/Desktop/Selenium7.html");

		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("document.getElementById('i1').value='karthikS'");
	}

}
  