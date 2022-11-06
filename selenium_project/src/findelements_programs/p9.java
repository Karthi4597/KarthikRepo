package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program to click on selenium download in autosuggetions
public class p9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in");

		driver.findElement(By.name("q")).sendKeys("selenium");

		Thread.sleep(2000);

		List<WebElement> suggetions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));

		for (WebElement lv : suggetions) {
			String text = lv.getText();
			if (text.equals("selenium download")) {
				lv.click();
				break;
			}
		}
	}
}
