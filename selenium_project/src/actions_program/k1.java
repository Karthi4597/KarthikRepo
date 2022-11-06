package actions_program;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class k1 {
	public static void main(String[] args) throws Exception {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// define implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximize the window
		driver.manage().window().maximize();
		// fetches the webpage
		driver.get("https://www.vtiger.com");
		WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		
		int x = resources.getLocation().getX();
		int y = resources.getLocation().getY();
		
//		Robot r=new Robot();
//		r.mouseMove(x, y);
		
		Actions a=new Actions(driver);
		
		a.moveToElement(resources).perform();
		
		
}
}
