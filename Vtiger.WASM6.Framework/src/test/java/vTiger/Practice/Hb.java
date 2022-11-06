package vTiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hb {
	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver=new ChromeDriver();
driver.get("https://atlantapd.maps.arcgis.com/apps/dashboards/f341c778e4d04eef9aed32e300feeca1");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

Thread.sleep(5000);

WebElement baseElement = driver.findElement(By.xpath("(//div[@class='font-light dashboard-secondary-text-color flex'])[1]"));
WebElement root1 = driver.findElement(By.className("label"));



	}
	
	


}
