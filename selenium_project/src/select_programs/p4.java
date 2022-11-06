package select_programs;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


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
		driver.get("file:///C:/Users/vishnu/Desktop/select.html");
		// identifies listbox
		WebElement listBox = driver.findElement(By.id("KB"));
		// creates an object of select class
		Select s = new Select(listBox);
		List<WebElement> options = s.getOptions();
		System.out.println(options.getClass().getName());

		for (WebElement lv : options) {
			System.out.println(lv.getText());
		}
	}
}
