package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webActionsUtil {
WebDriver driver;
public static String getData(String path,String sn,int r,int c)
{
	try
	{
		FileInputStream f1=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f1);
		String data = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
		return data;
	}
	catch (Exception e) {
		return null;
	}
}
public void validateTitle(String expectedTitle)
{
	try
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		System.out.println("pass:title is matching");
	}
	catch(Exception e)
	{
		System.out.println("fail: title is matching");
		Assert.fail();
	}
}
public void captureScreenshot(String scriptname)
{
	TakesScreenshot t=(TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File(baseTest.userDir+"//screenshot//"+scriptname+".png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
	}
}
}
