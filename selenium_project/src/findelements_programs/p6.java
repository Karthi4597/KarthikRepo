package findelements_programs;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//programs to print the shoes in sorted order of price
public class p6 {

	public static void main(String[] args) throws InterruptedException {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the crome browser
		WebDriver driver = new ChromeDriver();
		// opens flipkart
		driver.get("https://www.flipkart.com/");
		// maximises the window
		driver.manage().window().maximize();
		// identify the popup and closes it
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// identifies the search coloum and enters the woodland shoes
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("woodland shoes");
		// ientifies search symbol and click on it
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		// pauses the execution by 3 sec
		Thread.sleep(3000);
		// finds the webelements shoes title and stores in titles
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));

		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));

		TreeMap<Integer, String> t = new TreeMap<>();

		for (int i = 0; i < titles.size(); i++) {
			String title = titles.get(i).getText();
			String sprice = prices.get(i).getText();
			// coverts string into integer
			int iprice = Integer.parseInt(sprice.substring(1).replace(",", ""));
			// prints the shoes which are above 3000
			t.put(iprice, title);
		}

		for (Entry<Integer, String> lv : t.entrySet()) {
			System.out.println(lv.getValue() + "=" + lv.getKey());
		}
		driver.quit();

	}

}
