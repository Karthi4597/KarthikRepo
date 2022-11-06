package popup_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class k2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// add wait timings
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		// fetches the webpage
		driver.get(
				"https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=Cj0KCQjw39uYBhCLARIsAD_SzMSfIVNrGyzodz799zLhlaqHRthTdMcy8z03qZqZXViyRVUTdBR5_90aAhGxEALw_wcB&gclsrc=aw.ds");

		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();

//			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		Thread.sleep(1000);

		filehandle("E:\\Karthik\\selenium_workspace\\seleium_project\\upload\\Kar_resumeee.rtf");
	}

	public static void filehandle(String location) throws AWTException {
		StringSelection s = new StringSelection(location);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
