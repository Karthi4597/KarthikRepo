package FirstPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrganizationWithIndustry {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.manage().window().maximize();
	driver.get("http://localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	
	
	driver.findElement(By.xpath("(//a[contains(text(),'Organizations')])[1]")).click();
	
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("JnvMysore111");
	
	WebElement industry = driver.findElement(By.xpath("//select[@name='industry']"));
	
	Select s=new Select(industry);
	s.selectByValue("Healthcare");
	
	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	
	Thread.sleep(4000);
	
	WebElement logOut = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
	
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	
	//wait.until(ExpectedConditions.visibilityOf(logOut));
	Actions a=new Actions(driver);
	a.moveToElement(logOut).perform();;
	
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
}
}
