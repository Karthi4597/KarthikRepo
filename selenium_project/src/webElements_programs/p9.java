package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		WebElement element = driver.findElement(By.linkText("actiTIME Inc."));

		String tn = element.getTagName();

		if (tn.equals("a"))
			System.out.println("it is a link");
		else
			System.out.println("it is not a link");

		System.out.println(element.isDisplayed());

		driver.quit();
	}
}
