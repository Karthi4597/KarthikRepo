package vTiger.ContactsTests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import vTiger.genericLibrary.ExcelFileLibrary;
import vTiger.genericLibrary.JavaLibrary;
import vTiger.genericLibrary.PropertyFileLibrary;
import vTiger.genericLibrary.WebDriverLibrary;

public class CreateContactsTest {

	public static void main(String[] args) throws Throwable {

		WebDriverLibrary wLib = new WebDriverLibrary();
		JavaLibrary jLib=new JavaLibrary();
		PropertyFileLibrary pLib=new PropertyFileLibrary();
		ExcelFileLibrary eLib=new ExcelFileLibrary();
		

		
		String BROWSER = pLib.readDataFromPropertyFile("browser");
		String USERNAME = pLib.readDataFromPropertyFile("username");
		String PASSWORD = pLib.readDataFromPropertyFile("password");
		String URL = pLib.readDataFromPropertyFile("url");
		
		
		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

		
		driver.get(URL);
		wLib.maximiseWindow(driver);
		wLib.waitsForPageToLoad(driver);
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		int num = jLib.getNumber();
		String data = eLib.readDataFromExcel("organization", 1, 2)+num;
		
		driver.findElement(By.name("accountname")).sendKeys(data);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='themes/softed/images/user.PNG']")));
		WebElement logoutElement = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='themes/softed/images/user.PNG']")));
		
		

		//wLib.waitsForElementToBeVisible(driver, logoutElement);
		wLib.mouseOverON(driver, logoutElement);
		
		
		
		driver.findElement(By.linkText("Sign Out")).click();
		
	}

}
