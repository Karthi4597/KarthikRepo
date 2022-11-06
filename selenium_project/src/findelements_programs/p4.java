package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
	public static void main(String[] args) throws InterruptedException {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the crome browser
		WebDriver driver = new ChromeDriver();
		// fetches the webpage
		driver.get(
				"https://www.ajio.com/?utm_source=Admitad&utm_medium=Affiliate&utm_campaign=96fa4526b6eb9a9795854153b8ccfcad");
		// maximises the windo
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("nike sneakers");

		driver.findElement(By.xpath("//span[@class='ic-search']")).click();

		List<WebElement> titles = driver.findElements(By.xpath("//div[@class='nameCls']"));

		System.out.println(titles.getClass().getName());

		for (WebElement lv : titles) {
			System.out.println(lv.getText());
		}
	}
}
