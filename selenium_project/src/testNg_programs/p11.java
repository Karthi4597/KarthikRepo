package testNg_programs;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p11 {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void actilogin(String bn)
	{
		//sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//sets the path for gecko.exe
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
         
		if(bn.equals("chrome"))
		{
			driver=new ChromeDriver();//opens chrome browser
		}
		else if(bn.equals("firefox"))
		{
		   driver=new FirefoxDriver();//opens firefox browser
		}
               
		//fetches the web page
	    driver.get("https://demo.actitime.com/login.do");
		//defines implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
		// maximize the window
	    driver.manage().window().maximize();	    
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    driver.quit();
	    }
	
	@Parameters("browser")
	@BeforeTest
	public void beforetest(String bn)
	{
		System.out.println("beginning of the test execution in "+bn);
	}
	
	@Parameters("browser")
	@AfterTest
	public void aftertest(String bn)
	{
		System.out.println("end of the execution in "+bn);
	}
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}
}
