package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// fetches the webpage
		driver.get("https://www.facebook.com/");
		// identify all the links
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		// returns the size of the links
		System.out.println(links.size());
		// returns the implementing class name of the list
		System.out.println(links.getClass().getName());

		for (WebElement lv : links) {
			System.out.println(lv.getText());
		}
	}
}
