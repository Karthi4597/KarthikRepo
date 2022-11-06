package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//prg to handle multiple tabs
public class k4 {
	public static void main(String[] args) {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// fetches the web page
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		// method call stmt
		multipleTabs(driver);
		System.out.println(driver.getTitle());
	}

	public static void multipleTabs(WebDriver driver) {
		// retrieves thr reference of main tab
		String mainTab = driver.getWindowHandle();
		// retrives references of the all tabs
		Set<String> allTabs = driver.getWindowHandles();
		for (String lv : allTabs) {
			// switches the control to the specified tab
			driver.switchTo().window(lv);
			// closes the main tab
			if (lv.equals(mainTab)) {
				driver.close();
			}
		}
	}
}
