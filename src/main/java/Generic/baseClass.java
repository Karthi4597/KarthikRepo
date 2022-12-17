package Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Generic.PropertyFileLibrary;

public class baseClass {
	
	public PropertyFileLibrary pLib=new PropertyFileLibrary();
	WebDriver driver=null;
	
	
	
@BeforeMethod
public void BM() throws IOException
{
	String BROWSER = pLib.ReadDataFromPropertyFile("browser");
	String UN = pLib.ReadDataFromPropertyFile("username");
	String PW = pLib.ReadDataFromPropertyFile("passsword");
	String URL = pLib.ReadDataFromPropertyFile("url");
	if(BROWSER.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equals("firefox"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(URL);
}

@AfterMethod
public void AM() throws InterruptedException
{
	Thread.sleep(3000);
	driver.close();
}
}
