package takescreenshot_programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File a = t.getScreenshotAs(OutputType.FILE);
		
		File b=new File("./screenshot/p8.png");
		
		try {
			FileUtils.copyFile(a, b);
		} catch (IOException e) {
			
		}
		
		driver.close();
		
	}

}
