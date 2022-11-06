package javascript_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// opens the actitime application
		driver.get("https://www.actitime.com/");
		// identify the start free trial
		WebElement element = driver.findElement(By.xpath("(//a[text()='Start Free Trial'])[3]"));
		// retrive the x and y co-ordinate
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		// type casts the object from webdriver to javascriptexecutor
		JavascriptExecutor j = (JavascriptExecutor) driver;
		// scroll
		j.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

}
