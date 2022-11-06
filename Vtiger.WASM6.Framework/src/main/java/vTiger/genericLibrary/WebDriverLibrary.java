package vTiger.genericLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverLibrary {

	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximiseWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will wait for 20 seconds to load the page
	 * @param driver
	 */
	public void waitsForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	/**	
	 * This method will wait for 10 seconds for element to be visible
	 * @param driver
	 * @param element
	 */
	public void waitsForElementToBeVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	/**	
	 * This method will wait for 30 seconds for element which is to be clickable to be visible
	 * @param driver
	 * @param element
	 */
	public void visibilityOfElementToBeClickeble(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	/**
	 * This method will handle drop-down through select class and select data by index
	 * @param element
	 * @param index
	 */
	
	public void handleDropDown(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This method will handle drop-down through select class and select data by value
	 * @param element
	 * @param value
	 */
	public void handleDropDown(WebElement element,String value)
	{
		Select s=new Select(element);
		s.deselectByValue(value);
	}
	
	/**
	 * This method will handle drop-down through select class and select data by text
	 * @param text
	 * @param element
	 */
	public void handleDropDown(String text,WebElement element)
	{
		Select s=new Select(element);
		s.deselectByVisibleText(text);;
	}
	
	/**
	 * This method will perform mouse hover action on web element
	 * @param driver
	 * @param element
	 */
	public void mouseOverON(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * This method will perform right click operation
	 * @param driver
	 */
	public void rightClickOn(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	
	/**
	 * This method will perform double click on Web element
	 * @param driver
	 * @param element
	 */
	public void doubleClickOn(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	/**
	 * This method will perform double click operation
	 * @param driver
	 */
	public void doubleClickOn(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}
	
	/**
	 * This method will perform drag and drop operation
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDropOn(WebDriver driver,WebElement source,WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	
	/**
	 * This method perform mouseover on x and y axix
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void mouseOverOn(WebDriver driver,int x,int y)
	{
		Actions a=new Actions(driver);
		a.moveByOffset(x, y).perform();
	}
	/**
	 * This method switches to frame based on index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method will switch to frame based on name or id
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver,String IdorName)
	{
		driver.switchTo().frame(IdorName);
	}
	
	/**
	 * This method will switch to frame based on element
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will switch from current frame to immediate parent
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	/**
	 * This method will switch from current frame to default frame
	 * @param driver
	 */
	public void switchToDefaultFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method will click accept in alert pop up
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method will click cancel in alert pop up
	 * @param driver
	 */
	public void cancleAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method will return the text of alert pop up to the caller
	 * @param driver
	 * @return
	 */
	public String getText(WebDriver driver)
	{
		String text = driver.switchTo().alert().getText();
		return text;
	}
	
	/**
	 * This method presses enter key
	 * @throws AWTExceptio
	 * @throws AWTException
	 */
	public void pressEnter() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * This method will switch the controll to required window
	 * @param driver
	 * @param value
	 */
	public void switchToWindows(WebDriver driver,String windowTitle)
	{
		Set<String> windows = driver.getWindowHandles();
		
		for(String lv:windows)
		{
			if(lv.contains(windowTitle))
			{
				driver.switchTo().window(lv);
				break;
			}
		}
	}
	
	/**
	 * This methods take Screenshots
	 * @param driver
	 * @param screenShotName
	 * @throws IOException
	 */
	public void takeScreenshot(WebDriver driver,String screenShotName) throws IOException
	{
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\screenshots\\"+ screenShotName +".png");
		FileUtils.copyFile(src, dest);
	}
	
	/**
	 * This method will scroll down for 500 units
	 * @param driver
	 */
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
	
	/**
	 * This method will scroll untill the specified element is found
	 * @param driver
	 * @param element
	 */
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
	}
}
