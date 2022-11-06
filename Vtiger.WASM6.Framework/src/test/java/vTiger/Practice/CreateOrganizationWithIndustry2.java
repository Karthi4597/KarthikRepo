package vTiger.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrganizationWithIndustry2 {
	public static void main(String[] args) throws InterruptedException, IOException {

		FileInputStream f = new FileInputStream(".\\data\\commonsData.properties");
		Properties p = new Properties();
		p.load(f);
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		String BROWSER = p.getProperty("browser");

		WebDriver driver = null;
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("no browser is selected");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		FileInputStream f1 = new FileInputStream(".\\data\\TestData.xlsx");
		Workbook book = WorkbookFactory.create(f1);
		String value = book.getSheet("organization").getRow(4).getCell(2).getStringCellValue();
		String IndType = book.getSheet("organization").getRow(4).getCell(3).getStringCellValue();

		driver.findElement(By.xpath("(//a[contains(text(),'Organizations')])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(value);
		WebElement industry = driver.findElement(By.xpath("//select[@name='industry']"));

		Select s = new Select(industry);
		s.selectByValue(IndType);
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();

		driver.navigate().refresh();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//td[@class='small'])[2]")));

		WebElement logOut = driver.findElement(By.xpath("(//td[@class='small'])[2]"));

		Actions a = new Actions(driver);
		a.moveToElement(logOut).perform();
		

		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//		driver.quit();

	}
}
