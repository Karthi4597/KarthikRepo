package actions_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//programs for actions class to double click
public class p2 {
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
		driver.get("file:///C:/Users/vishnu/Desktop/doubleclick.html");
		// identifies the text
		WebElement text = driver.findElement(By.id("demo"));
		// creates an object of actions class
		Actions a = new Actions(driver);
		// double clicks on webelement
		a.doubleClick(text).perform();
	}
}
