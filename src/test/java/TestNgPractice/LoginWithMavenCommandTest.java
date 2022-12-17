package TestNgPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Generic.PropertyFileLibrary;
import Generic.baseClass;

public class LoginWithMavenCommandTest  {
	
	WebDriver driver;
	
	PropertyFileLibrary pLib=new PropertyFileLibrary();
	@BeforeMethod
	public void BM() throws IOException
	{
		String BROWSER = System.getProperty("browser");
		String URL = pLib.ReadDataFromPropertyFile("url");
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@Test
	public void Method1test()
	{
		System.out.println("First test scripts 1");
	}
	
	@AfterMethod
	public void AM() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	

}
