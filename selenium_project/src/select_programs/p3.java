package select_programs;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//program for selecting option
public class p3 {
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
		// select the option based on text
		s.selectByVisibleText("Lolipop");
		// select the option based on index
		s.selectByIndex(0);
		// select the option based on value
		s.selectByValue("K");

		WebElement fs = s.getFirstSelectedOption();
		System.out.println(fs.getText());

		System.out.println("=====================");

		List<WebElement> allSelected = s.getAllSelectedOptions();

		for (WebElement lv : allSelected) {
			System.out.println(lv.getText());
		}
	}
}
