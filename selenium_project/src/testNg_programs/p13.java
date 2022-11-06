package testNg_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p13 {
@DataProvider(parallel=true)
public Object[][] logindata()
{
	Object[][] d=new Object[4][2];
	d[0][0]="admin";
	d[0][1]="manager";
	d[1][0]="trainee";
	d[1][1]="trainee";
	d[2][0]="Abhi";
	d[2][1]="1234";
	d[3][0]="Java";
	d[3][1]="Selenium";
	return d;
}

@Test(dataProvider="logindata")
public void actiloginScript(String un,String pw)
{
	// set the path for chromedriver.exe
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// launches the chrome browser
	WebDriver driver = new ChromeDriver();
	// fetches the webpage
	driver.get("https://demo.actitime.com/login.do");
	// maximize the window
	driver.manage().window().maximize();
	// identify the username and enters the username
	driver.findElement(By.name("username")).sendKeys(un);
	// identify thw password and enters the password
	driver.findElement(By.name("pwd")).sendKeys(pw);
	// identify the login button and clicks on it
	driver.findElement(By.id("loginButton")).click();
	
	//driver.quit();

}
}
