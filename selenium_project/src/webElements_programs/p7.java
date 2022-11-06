package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		WebElement un = driver.findElement(By.name("username"));

		WebElement pw = driver.findElement(By.name("pwd"));

		int h1 = un.getSize().getHeight();
		int w1 = un.getSize().getWidth();

		int h2 = pw.getSize().getHeight();
		int w2 = pw.getSize().getWidth();

		System.out.println("height1=" + h1 + " width1=" + w1);
		System.out.println("height2=" + h2 + " width2=" + w2);

		if (h1 == h2 && w1 == w2)
			System.out.println("pass:same dimensions");
		else
			System.out.println("fail:different dimension");

		driver.quit();
	}
}
