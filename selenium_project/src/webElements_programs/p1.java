package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p1 {

	public static void main(String[] args) {

		// set the path for chromedriver.exe
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// launches the chrome browser
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		// fetches the webpage
		driver.get("file:///C:/Users/vishnu/Desktop/Selenium1.html");

		// maximise the window
		// driver.manage().window().maximize();

		// identify the webelements using id
		// WebElement link = driver.findElement(By.id("i1"));

		// identify the webelements using name
		// WebElement link = driver.findElement(By.name("n1"));

		// identify the webelements using classname
		// WebElement link = driver.findElement(By.className("c1"));

		// identify the webelemts using tag name
		// WebElement link = driver.findElement(By.tagName("a"));

		// identify the web elements using linktext
		// WebElement link = driver.findElement(By.linkText("Facebooooook"));

		WebElement link = driver.findElement(By.partialLinkText("Faceb"));

		// clicks on webelement
		link.click();

	}

}
