package findelements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// fetches the webpage
		driver.get("file:///C:/Users/vishnu/Desktop/Selenium1.html");

		WebElement link = driver.findElement(By.id("i1"));

		String text = link.getText();
		System.out.println(text);

	}
}
