package apavhe_programs;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_pages.initialisePages;

public class p5 {
	public static String getData(String path,String sn,int r,int c)
	{
		try
		{
		FileInputStream f1=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f1);
		String data = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
		return data;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public static void main(String[] args) throws InterruptedException, Throwable 
	{
		FileInputStream f=new FileInputStream("./data/config.properties");
		Properties p=new Properties();
		p.load(f);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.get(p.getProperty("url"));
		
		initialisePages pages=new initialisePages(driver);
		pages.actiLogin.login(p.getProperty("username"), p.getProperty("password"));
		pages.actiTimeTrack.users();
		pages.actiUserList.newUser();
		Thread.sleep(3000);
		pages.actiAddUser.addUser(getData("./data/ecxel.xlsx","adduser",1,0),
				getData("./data/ecxel.xlsx", "adduser",1,1),
				getData("./data/ecxel.xlsx", "adduser", 1,2));
		
			}

}
