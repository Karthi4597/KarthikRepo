package vTiger.genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.Practice;

public class BaseTest {
	
	WebDriverLibrary wLib=new WebDriverLibrary();
	ExcelFileLibrary eLib=new ExcelFileLibrary();
	PropertyFileLibrary pLib=new PropertyFileLibrary();
	
	public WebDriver driver=null;
	
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Data base connected");
	}
	
	@BeforeClass
	public void BeforeClass() throws IOException
	{
		
		String URL = pLib.readDataFromPropertyFile("url");
		String BROWSER = pLib.readDataFromPropertyFile("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		}
	
	@BeforeMethod
	public void BeforeMethod() throws IOException
	{
		String UN = pLib.readDataFromPropertyFile("username");
		String PW = pLib.readDataFromPropertyFile("password");
		Practice p=new Practice(driver);
		p.loginToApp(UN, PW);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.logout(driver);
	}
	
	@AfterClass
	public void AfterClass()
	{
		driver.close();

	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Database disconnected");
	}
	
	

}
