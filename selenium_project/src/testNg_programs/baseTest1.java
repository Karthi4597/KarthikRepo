package testNg_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest1 
{
	WebDriver driver; 
	@BeforeMethod
	public void precondition()
	{
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void postcondition()
	{
		//closes the browser
		driver.quit();

	}

}
