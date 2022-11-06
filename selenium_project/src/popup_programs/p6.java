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

public class p6 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// set the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximise the window
		driver.manage().window().maximize();
		// add wait timings
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// fetches the webpage
		driver.get(
				"https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=CjwKCAjwvNaYBhA3EiwACgndguY4rEkBU1vYglnT2mNrYnmxLFFqCHnkLw4Wb5ewHW52GVNb6gW5IxoCikEQAvD_BwE&gclsrc=aw.ds");
		// finds the upload button and clicks
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		// pauses for 1s
		Thread.sleep(1000);

		fileUpload("E:\\Karthik\\selenium_workspace\\seleium_project\\upload\\karthikResume.rtf");
	}

	public static void fileUpload(String location) throws AWTException {
		// sets the content of the clipboard with the location
		StringSelection s = new StringSelection(location);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// creates the object of robot class
		Robot r = new Robot();
		// presses on controll+v
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_V);
		// release the controll+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		// presses the enter
		r.keyPress(KeyEvent.VK_ENTER);
		// release the enter
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
