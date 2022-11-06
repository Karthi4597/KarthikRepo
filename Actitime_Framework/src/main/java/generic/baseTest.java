package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseTest {
	public static final String userDir=System.getProperty("user.dir");
	public static final String chromekey="webdriver.chrome.driver";
	public static final String geckokey="webdriver.gecko.driver";
	public static final String chromeValue=userDir+"\\drivers\\chromedriver.exe";
	public static final String geckoValue=userDir+"\\drivers\\geckodriver.exe";

	public WebDriver driver;
	/*sets the path for driver executable*/
	@BeforeClass
	public void setPath()
	{
		System.setProperty(chromekey, chromeValue);
		System.setProperty(geckokey, geckoValue);
	}
	/*launches the browser,define implicitly wait and fetches the application*/
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String bn)
	{
		if(bn.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(bn.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
//		driver.quit();
	}
	@AfterSuite
	public void killDriver()
	{
		try {
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
		Runtime.getRuntime().exec("taskkill /IM geckodriver.exe /F");
		}
		catch(Exception e)
		{
			
		}

	}
	
	
}
