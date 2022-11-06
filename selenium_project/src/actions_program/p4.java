package actions_program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p4 {
	public static void main(String[] args) throws AWTException {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// define implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximize the window
		driver.manage().window().maximize();
		// fetches the webpage
		driver.get("https://demo.actitime.com/login.do");
		// identifies the link
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		// creates an object of actions class
		Actions a = new Actions(driver);
		// right clicks on the web element
		a.contextClick(link).perform();
		// Creates an object of robot class
		Robot r = new Robot();
		// presses on W
		r.keyPress(KeyEvent.VK_T);
		// release the key W
		r.keyRelease(KeyEvent.VK_T);
		
	}
}
