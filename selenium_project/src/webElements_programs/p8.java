package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.actitime.com/");

		WebElement element = driver.findElement(By.xpath("(//a[text()='Start Free Trial'])[3]"));

		int x = element.getLocation().getX();

		int y = element.getLocation().getY();

		System.out.println("distance x = " + x + " distance y = " + y);

		driver.quit();
	}
}
