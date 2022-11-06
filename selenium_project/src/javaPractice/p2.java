package javaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/vishnu/Desktop/Selenium1.html");

		// WebElement link = driver.findElement(By.id("i1"));

		// WebElement link = driver.findElement(By.name("n1"));

		// WebElement link = driver.findElement(By.className("c1"));

		By s = By.linkText("Facebooooook");

		WebElement link = driver.findElement(s);

		link.click();

	}

}
