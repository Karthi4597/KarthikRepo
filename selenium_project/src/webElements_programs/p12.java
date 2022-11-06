package webElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p12 {

	public static void main(String[] args) {
		// sets the path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome driver
		WebDriver driver = new ChromeDriver();
		// opens the actitime application
		driver.get("https://demo.actitime.com/login.do");
		// find the elements ans stores in vareable
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		// checks wheather the checkbox is selected or not
		boolean a = checkbox.isSelected();
		System.out.println(a);
		// clicks on the checkbox
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		// checks wheather the checkbox is selected or not
		boolean b = checkbox.isSelected();
		System.out.println(b);
		//// fetch the name attribute of checkbox
		String c = checkbox.getAttribute("name");
		System.out.println(c);
		// fetch the tagname of the checkbox
		String d = checkbox.getTagName();
		System.out.println(d);
		// fetch the cssValue of the checkbox
		String e = checkbox.getCssValue("display");
		System.out.println(e);
		// find the username web element
		WebElement un = driver.findElement(By.id("username"));
		// check wheather the username is displayed or not
		boolean f = un.isDisplayed();
		System.out.println(f);
		// check wheather the username is Enabled or not
		System.out.println(un.isEnabled());

		// sendkeys()
		// click()
		// clear()
		// submit()

	}

}
