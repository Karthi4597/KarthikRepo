package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class k4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in");

		driver.findElement(By.name("q")).sendKeys("selenium");

		Thread.sleep(3000);

		List<WebElement> suggetions = driver.findElements(By.xpath("//span[contains[text()='selenium']]"));

		for (WebElement lv : suggetions) {
			System.out.println(lv.getText());
		}
	}
}
