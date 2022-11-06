package findelements_programs;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class k3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("nike sports shoes");

		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();

		Thread.sleep(6000);

		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));

		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));

		TreeMap<Integer, String> t = new TreeMap<>();

		for (int i = 0; i < titles.size(); i++) {
			String title = titles.get(i).getText();

			String sprice = prices.get(i).getText();

			int iprice = Integer.parseInt(sprice.substring(1).replace(",", ""));

			t.put(iprice, title);
		}

		for (Entry<Integer, String> lv : t.entrySet()) {
			System.out.println(lv.getValue() + "=" + lv.getKey());
		}

		driver.quit();
	}

}
