package vTiger.Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import vTiger.ObjectRepository.CreateOrganization;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.OrganizationPage;
import vTiger.ObjectRepository.Practice;
import vTiger.ObjectRepository.initialPages;
import vTiger.genericLibrary.ExcelFileLibrary;
import vTiger.genericLibrary.PropertyFileLibrary;
import vTiger.genericLibrary.WebDriverLibrary;

public class PomPractice {

	public static void main(String[] args) throws Throwable {
		ExcelFileLibrary efl = new ExcelFileLibrary();
		PropertyFileLibrary pfl = new PropertyFileLibrary();
		WebDriverLibrary wdl = new WebDriverLibrary();
		
		String URL = pfl.readDataFromPropertyFile("url");

		WebDriver driver = new ChromeDriver();
		
		initialPages pages=new initialPages(driver);

		driver.get(URL);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String UN = pfl.readDataFromPropertyFile("username");
		String PW = pfl.readDataFromPropertyFile("password");

		pages.pPage.loginToApp(UN, PW);

		pages.hPage.ClickOnOrgaLink();

		pages.oPage.clickOnNewOrg();

		String ON = efl.readDataFromExcel("practice", 3, 0);
		String emp = efl.readDataFromExcel("practice", 3, 1);

		pages.orgPage.Organization(ON, emp);

	}
}
