package popup_programs;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//file upload popup using(auto it)
public class p7 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
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
		// executes the exe file
		Runtime.getRuntime().exec("E:\\Karthik\\selenium_workspace\\seleium_project\\upload\\popup.exe");

	}
}
