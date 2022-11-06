package takescreenshot_programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) throws IOException {
		// sets the path for cromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// loads the webpage and waits until the page is loaded completely
		driver.get("https://www.ajio.com");
		String title = driver.getTitle();
		// cast the object from webdriver to takeScreenshot
		TakesScreenshot t = (TakesScreenshot) driver;
		// catures the screenshot and returns it in File class object
		File src = t.getScreenshotAs(OutputType.FILE);
		// creates an object of File class pointing towards p1.png
		File dest = new File("./screenshot/" + title + ".png");
		// copies the content from src to dest
		FileUtils.copyFile(src, dest);
	}
}
