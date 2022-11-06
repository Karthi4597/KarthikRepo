package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// fetches the webpage
		driver.get("file:///C:/Users/vishnu/Desktop/page2.html");
		// identify the t2 and enters the data
		driver.findElement(By.id("t2")).sendKeys("java");
		// identify the frame and saves the frame
		WebElement fr = driver.findElement(By.name("n1"));
		// switches the control to inner frame
		driver.switchTo().frame(fr);
		// identifies t1 and enters data
		driver.findElement(By.id("t1")).sendKeys("automation");

	}

}
