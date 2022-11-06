package testNg_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseTest2 {
	WebDriver driver;
@BeforeClass
public void preclass()
{
	// set the path for chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// launches the chrome browser
			driver = new ChromeDriver();
			// maximize the window
			driver.manage().window().maximize();
}
@AfterClass
public void postclass()
{
	//closes the browser
			driver.quit();
}
}
