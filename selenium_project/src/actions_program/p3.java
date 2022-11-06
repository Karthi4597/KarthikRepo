package actions_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//program for drang and drop
public class p3 {
	public static void main(String[] args) {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// define implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximize the window
		driver.manage().window().maximize();
		// fetches the webpage
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		// identifies the block 1
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		// identifies the block 4
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		// creates an object of actions class
		Actions a = new Actions(driver);
		// drags block1 and releses it over
		a.dragAndDrop(block1, block4).perform();
	}
}
