package vTiger.Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateContactWithOrganization {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("(//a[contains(text(),'Organizations')])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("JnvMysuru");
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();

		// WebElement contact =
		// driver.findElement(By.xpath("(//a[text()='Contacts'])[1]"));

		driver.navigate().refresh();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Contacts'])[1]")));

		driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("karthik");
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();

		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();

		for (String lv : child) {
			if (!lv.equals(main)) {
				driver.switchTo().window(lv);
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='JnvMysore']")).click();

		for (String lv : child) {
			if (lv.equals(main)) {
				driver.switchTo().window(lv);
				break;
			}
		}

		// driver.switchTo().defaultContent();

		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(4000);
		WebElement logOut = driver.findElement(By.xpath("(//td[@class='small'])[2]"));

		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.visibilityOf(logOut));

		Actions a = new Actions(driver);
		a.moveToElement(logOut).perform();
		;
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.quit();

	}
}
