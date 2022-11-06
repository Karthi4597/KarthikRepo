package takescreenshot_programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.facebook.com");
	
	TakesScreenshot t=(TakesScreenshot) driver;
	
	File a = t.getScreenshotAs(OutputType.FILE);
	
	File b=new File("./screenshot/p5.png");
	
	FileUtils.copyFile(a, b);
	
	
	
	
}
}
