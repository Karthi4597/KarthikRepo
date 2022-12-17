package ER.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class FirstReport {
	ExtentReports extents;

	@BeforeMethod
	public void BM() {
		ExtentSparkReporter reporter = new ExtentSparkReporter(
				"\\Users\\suman\\Desktop\\interview\\ExtentReports\\Reports\\index.html");
		reporter.config().setReportName("First Report");
		reporter.config().setDocumentTitle("Karthik Report");

		extents = new ExtentReports();
		extents.attachReporter(reporter);
		extents.setSystemInfo("Reporter", "Karthik");
	}

	@Test
	public void ReportTest() throws InterruptedException {
		ExtentTest test = extents.createTest("My first report");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");

		driver.manage().window().maximize();

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.close();
		test.fail("Report dont match");
		extents.flush();
	}
	@Test
	public void ReportTest1() throws InterruptedException {
		ExtentTest test = extents.createTest("My Second report");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");

		driver.manage().window().maximize();

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.close();
		extents.flush();
	}

}
